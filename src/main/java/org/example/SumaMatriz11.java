package org.example;

public class SumaMatriz11 {

    public static void main(String[] args) {


        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int j=matriz[0].length-1;
        SumarElementosMatriz(matriz,0,j,0);
    }

    private static void SumarElementosMatriz(int[][] matriz, int i, int j,int suma) {

        if (i== matriz.length||j<0) {

            System.out.println("\n La suma es: "+suma);

        }else {
            System.out.print(" "+matriz[i][j]);
            suma+=matriz[i][j];

            if (j==0&&i<matriz.length-1){
                i++;
                j= matriz[i].length-1;

                System.out.println(" ");

            }else {
                j--;
            }
            SumarElementosMatriz(matriz,i,j,suma);
        }

    }
}
