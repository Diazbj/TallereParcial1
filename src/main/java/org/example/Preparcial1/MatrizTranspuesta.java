package org.example.Preparcial1;

public class MatrizTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 5},
                {2, 5, 6, 7},};

        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        matrizTranspuesta = traspuesta(matriz, matrizTranspuesta, 0, 0);
        recorrerMatriz(matrizTranspuesta, 0, 0);
    }

    private static int[][] traspuesta(int[][] matriz, int[][] matrizTranspuesta, int i, int j) {
        if (i == matriz.length || j == matriz[i].length) {
            return matrizTranspuesta;
        } else {
            matrizTranspuesta[j][i] = matriz[i][j];
            if (j == matrizTranspuesta.length - 1) { // Cuando se llena la última columna de la matriz transpuesta
                return traspuesta(matriz, matrizTranspuesta, i + 1, 0); // Avanza a la siguiente fila en la matriz original
            } else {
                return traspuesta(matriz, matrizTranspuesta, i, j + 1); // Continúa en la misma fila en la matriz original
            }
        }
    }

    private static void recorrerMatriz(int[][] matriz, int i, int j) {

        if(i == matriz.length || j == matriz[i].length){
            System.out.println("Fin de la matriz");
        }else{
            System.out.print(" "+matriz[i][j]);
            if(j == matriz[i].length-1){
                i++;
                j = 0;
                System.out.println("");
            }else{
                j++;
            }
            recorrerMatriz(matriz, i, j);
        }
    }
}
