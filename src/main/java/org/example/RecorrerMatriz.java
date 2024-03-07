package org.example;

public class RecorrerMatriz {

    public static void  main(String[] args){

        int[][] matriz={
                {1,2,1},
                {0,0,3},
                {3,12,0},
                {1,0,0}
        };

        int numeroFilas=matriz.length-1;
        int numeroColumnas=matriz[0].length-1;
        int indiceFila=0;
        int indiceColumna=0;

        int contarCeros=NumeroDeCeros(matriz,numeroFilas,numeroColumnas,indiceFila,indiceColumna);

        System.out.println(contarCeros);

    }

    private static int NumeroDeCeros(int[][] matriz, int numeroFilas, int numeroColumnas,int indiceFila,int indiceColumna) {

        if (indiceFila>numeroFilas){

            return 0;

        }else{

            if(indiceColumna<=numeroColumnas){

                if(matriz[indiceFila][indiceColumna]==0){
                    return NumeroDeCeros(matriz, numeroFilas, numeroColumnas, indiceFila, indiceColumna+1)+1;
                }else {
                    return NumeroDeCeros(matriz, numeroFilas, numeroColumnas, indiceFila, indiceColumna+1);
                }

            }else {

                return NumeroDeCeros(matriz, numeroFilas, numeroColumnas, indiceFila+1, indiceColumna=0);

            }

        }


    }

}
