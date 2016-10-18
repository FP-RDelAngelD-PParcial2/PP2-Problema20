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
                suma=suma+i;//En la variable suma, se iran sumando los valores divisores del primer numero
                            //suma=0+1 suma=1
                            //suma=1+2 suma=3
                            //suma=3+4 suma=7
            }
        }
        if(suma==b){ //Si la suma de los divisores del primer numero es igual a el segundo numero //220==220 VERDADER0
            for(int i=1;i<b;i++){ //Se ejecutara un ciclo for que encontrara los divisores del segundo numero
                                  //i=1, 1<220
                                  //i=2, 2<220
                                  //i=3, 3<220
                                  //i=4, 4<220
                if(b%i==0){ //Si el residuo de b entre 1 es igual a 0
                            //220%1==0 VERDADERO
                            //220%2==0 VERDADERO
                            //220%3==0 FALSO
                            //220%4==0 VERDADERO
                    suma2=suma2+i;//En la variable suma2, se iran sumando los valores divisores del segundo numero
                                  //suma2=0+1 suma2=1
                                  //suma2=1+2 suma2=3
                                  //suma2=3+4 suma2=7
                }
            }
        }
        if(suma2==a){ //Si es que el resultado de suma2 es igual al primer numero
            System.out.print("Los numeros " + a + " y " + b + " son amigos"); //Se imprime que si son amigos
        }else{ //Sino
            System.out.print("Los numeros " + a + " y " + b + " no son amigos"); //Se imprime que no son amigos
        }
    }
    
}
