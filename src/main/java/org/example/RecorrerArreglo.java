package org.example;

import java.util.Arrays;

public class RecorrerArreglo {

    public static void main(String[] args){

        int[] arreglo={1,1,2,2,3,1,2,3};

        int indice=0;

        int tamaño=arreglo.length;
        int[] arregloFinal=new int[tamaño];

        int[] arregloRevez=ArregloInvertido(arreglo,indice,tamaño,arregloFinal);

        System.out.println("El arreglo es: "+Arrays.toString(arreglo));
        System.out.println("El arreglo invertido es: "+Arrays.toString(arregloRevez));


    }

    private static int[] ArregloInvertido(int[] arreglo, int indice,int tamaño,int[] arregloFinal) {



        if(tamaño-1<0){

            return arregloFinal;

        }else{
            arregloFinal[tamaño-1]=arreglo[indice];

            return ArregloInvertido(arreglo,indice+1,tamaño-1,arregloFinal);
        }

    }

}
