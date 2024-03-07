package org.example;

public class MatrizSimetrica16 {
    public static void main(String[] args){
        int[][] matriz = {{1, 2, 3, 5},
                          {2, 5, 6, 7},
                          {3, 6, 9, 6},
                          {5, 7, 6, 6}};
        int elementosIguales= (matriz.length* matriz[0].length-matriz.length)/2;
        int n=0;

        esSimetrica(matriz,n,0,0,elementosIguales);

    }

    private static void esSimetrica(int[][] matriz, int n, int i, int j,int elementosIguales) {
        if(i== matriz.length||j==matriz[i].length){
            if(n==elementosIguales&&matriz.length== matriz[0].length){
                System.out.println("La Matriz es simetrica");

            }else {
                System.out.println("La Matriz no es simetrica");
            }
        }else{
            if(j>i&&matriz[i][j]==matriz[j][i]){
                n++;
            }
            System.out.print(" "+matriz[i][j]);
            if(j == matriz[i].length-1){
                i++;
                j = 0;
                System.out.println("");
            }else{
                j++;
            }
            esSimetrica(matriz, n, i, j, elementosIguales);
        }
    }
}
