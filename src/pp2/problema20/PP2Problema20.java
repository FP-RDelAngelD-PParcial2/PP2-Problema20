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
        numerosAmigos();
    }
    public static int solicitarDatos(String d){ //Solicita los valores
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static int verificarNumero(String d){
        int a; //Variable
        do{ //Hacer que solicite datos y se guarden en a 
        a = solicitarDatos(d);
        }while(a<=0);//Mientras que a sea menor o igual que 0
        return a; //Regresa el valor de a
    }
    public static void numerosAmigos(){
        int a, b, suma;
        suma = 0;
        a=verificarNumero("numero 1 ");
        b=verificarNumero("numero 2 ");
        for(int i=1;i<a;i++){
            if(a%i==0){
                suma=suma+i;
            }
        }
        if(suma==b){
            for(int i=1;i<b;i++){
                if(b%i==0){
                    suma=suma+i;
                }
            }
        }
        if(suma==a){
            System.out.print("Los numeros " + a + " y " + b + " son amigos");
        }else{
            System.out.print("Los numeros " + a + " y " + b + " no son amigos");
        }
    }
    
}
