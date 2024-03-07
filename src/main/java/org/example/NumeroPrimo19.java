package org.example;

public class NumeroPrimo19 {
    public static void main(String[] args){

        int numero=96;
        int contador=1;
        esPrimo(numero,contador,0);

    }

    private static void esPrimo(int numero, int contador,int i) {
        if(contador>numero){
            if(i==2){
                System.out.println("El numero es primo");
            }else{
                System.out.println("El numero no es primo");
            }
        }else{
            if(numero%contador==0){

                i++;
            }
            esPrimo(numero, contador+1, i);
        }
    }
}
