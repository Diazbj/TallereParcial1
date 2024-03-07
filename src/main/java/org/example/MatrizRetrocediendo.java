package org.example;

public class MatrizRetrocediendo {
    public static void main(String[] args) {


        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        recorrerMatriz(matriz,matriz.length-1,matriz[0].length-1);
    }

    private static void recorrerMatriz(int[][] matriz, int i, int j) {

        if(i <0|| j < 0){
            System.out.println("\nFin de la matriz");
        }else{
            System.out.print(" "+matriz[i][j]);
            if(j ==0&&i>0){
                i--;
                j = matriz[i].length-1;
                System.out.println("");
            }else{
                j--;
            }
            recorrerMatriz(matriz, i, j);
        }
    }
}
