package org.example;

public class SumaDeDiagonal9 {
    public static void main(String[] args) {


        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int suma=0;
        int sumaFinal=SumaDiagonal(matriz,0,0,suma);

        System.out.println(sumaFinal);
    }

    private static int SumaDiagonal(int[][] matriz, int i, int j,int suma) {

        if(i==matriz.length||j==matriz[i].length){

            System.out.println("Fin de la matriz");
            return suma;

        }else{
            if(i==j){

                suma=suma+matriz[i][j];
            }

            if(j== matriz[i].length-1){
                i++;
                j=0;

            }else{
                j++;
            }
            return SumaDiagonal(matriz,i,j,suma);
        }

    }


}
