/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static int solicitarDatos(String d){ //Solicita los valores
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d + "\n");
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    
}
