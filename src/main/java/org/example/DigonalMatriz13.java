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

        if (i == matriz.length || j == matriz[i].length) {
            return 0;
        } else if (i == j) {
            return sumarDiagonal(matriz, i, j+1) + matriz[i][j];
        } else {
            return sumarDiagonal(matriz, i + 1, j);
        }
    }
}

