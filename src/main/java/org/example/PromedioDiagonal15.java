package org.example;

public class PromedioDiagonal15 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3,5},
                          {4, 5, 6,7},
                          {7, 8, 9,6},
                          {7, 8, 9,6}};
        int n=0;
        int suma=0;
        System.out.println(promedioDiagonal(matriz,n,0,0,suma));
    }

    private static double promedioDiagonal(int[][] matriz, int n, int i, int j,int suma) {

        if(i== matriz.length||j== matriz[i].length){
            if(n>0){
                return (double) suma/n;
            }
            return 0;

        }else if(i==j){
            suma=suma+matriz[i][j];

            return promedioDiagonal(matriz, n+1, i, j+1,suma);

        }else{
            return promedioDiagonal(matriz, n, i+1, j,suma);
        }
    }
}
