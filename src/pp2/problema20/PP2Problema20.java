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
    public static void numerosAmigos(){ //Dos números enteros positivos A y B 
                                        //son números amigos si la suma de los divisores propios de A es igual a B 
                                        //y la suma de los divisores propios de B es igual a A
        int a, b, suma, suma2;
        suma = 0;
        suma2 = 0;
        a=verificarNumero("numero 1 "); //Se solicita el primer numero //284
        b=verificarNumero("numero 2 "); //Se solicita el segundo numero //220
        for(int i=1;i<a;i++){//Ciclo para encontrar los divisores del numero 1
                             //i se inicia en 1, mientras que i sea menor que a, i aumentara 1
                             //i=1 1<284
                             //i=2 2<284
                             //i=3 3<284
                             //i=4 4<284
            if(a%i==0){    //Si el residuo de a entre i es igual a 0
                           //284%1==0 VERDADERO
                           //284%2==0 VERDADERO
                           //284%3==0 FALSO (sale del ciclo y entra al for)
                           //284%4==0 VERDADERO
                suma=suma+i;//En la variable suma, se iran sumando los valores divisores del numero
                            //suma=0+1 suma=1
                            //suma=1+2 suma=3
                            //suma=3+4 suma=7
            }
        }
        if(suma==b){
            for(int i=1;i<b;i++){
                if(b%i==0){
                    suma2=suma2+i;
                }
            }
        }
        if(suma2==a){
            System.out.print("Los numeros " + a + " y " + b + " son amigos");
        }else{
            System.out.print("Los numeros " + a + " y " + b + " no son amigos");
        }
    }
    
}
