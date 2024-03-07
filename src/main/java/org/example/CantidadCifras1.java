package org.example;

//Hallar la cantidad de cifras de un numero entero.

public class CantidadCifras1 {
    public static void main(String[] args) {

        int n=1234567891;
        int cifras=CalcularCantidadCifras(n);
        System.out.println();

    }

    public static int CalcularCantidadCifras(int n){

        if(n/10<10){
            return 2;
        }else {

            return CalcularCantidadCifras(n/10)+1;
            }
        }
    }
