package org.example;

import java.util.Arrays;

public class InvertirPalabra {

    public static void main(String[] args){

        String palabra="palabra";

        int tamaño=palabra.length()-1;
        String palabraInvertida="";

        String palabraRevez=InvertirPalabra(palabra,palabraInvertida,tamaño);

        System.out.println("La palabra es: "+palabraRevez);
        //System.out.println("El arreglo invertido es: "+Arrays.toString(arregloRevez));


    }

    private static String InvertirPalabra(String palabra,String palabraInvertida,int tamaño) {



        if(tamaño<0){

            return palabraInvertida;

        }else{

            palabraInvertida+=palabra.charAt(tamaño);

            return InvertirPalabra(palabra,palabraInvertida,tamaño-1);
        }

    }

}
