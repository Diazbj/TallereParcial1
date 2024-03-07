package org.example;

import java.util.Arrays;

public class ArrayDescendente20 {
    public static void main(String[] args) {
        int[] array = {8, 10, 2, 3, 4};
        int i = 0;
        int j = 1;
        int[] arrayOrdenado=arrayDesendente(i,array,j,0);
       System.out.println(Arrays.toString(arrayOrdenado));
    }

    private static int[] arrayDesendente(int i, int[] array, int j, int valor) {
        if (i == array.length) {

            return array;

        } else {
            if(j==array.length){
                j=0;
                return arrayDesendente(i+1, array, j, valor);
            }else{
                if (array[i] > array[j]) {
                    valor = array[i];
                    array[i] = array[j];
                    array[j] = valor;
                    return  arrayDesendente(i, array, j+1, valor);
                } else {
                    return arrayDesendente(i, array, j+1, valor);
                }
            }


        }
    }
}
