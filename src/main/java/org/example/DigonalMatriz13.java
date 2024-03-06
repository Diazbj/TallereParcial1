package org.example;

public class DigonalMatriz13 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 0;
        int j = 0;

        System.out.print(sumarDiagonal(matriz, i, j));

    }

    private static int sumarDiagonal(int[][] matriz, int i, int j) {

        if(i == matriz.length || j == matriz[i].length){
            System.out.println("Fin de la matriz");
        }else{
            if(i==j){
                return sumarDiagonal(matriz, i, j)+matriz[i][j];
                j++;
            }
            System.out.print(" "+matriz[i][j]);
            if(j == matriz[i].length-1){
                i++;
                j = 0;
                System.out.println("");
            }else{
                j++;
                return sumarDiagonal(matriz, i, j)+matriz[i][j];
            }
            sumarDiagonal(matriz, i, j);
        }
        return 0;
    }
}

