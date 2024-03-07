package org.example;

public class FilaMayor17 {
    public static void main(String[] args){

        int[][] matriz = {{1, 2, 3, 1},
                {2, 5, 6, 7},
                {3, 6, 9, 6},
                {5, 7, 6, 5}};

        int suma=0;
        int sumaMayor=0;
        int fila=0;
        filaSumaMayor(suma,sumaMayor,matriz,fila,0,0);

    }

    private static void filaSumaMayor(int suma,int sumaMayor, int[][] matriz,int fila, int i, int j) {

        if(i== matriz.length||j== matriz[i].length){

            System.out.println("La fila con la suma de elementos mayor es :"+fila);
        }else{
            suma=suma+matriz[i][j];
            if(j==matriz[i].length-1){
                System.out.println("la suma de la fila "+i+" es :"+suma);

                if(suma>sumaMayor){

                    sumaMayor=suma;
                    suma=0;
                    fila=i;
                }
                i++;
                j=0;
                suma=0;

            }else {
                j++;
            }
            filaSumaMayor(suma, sumaMayor, matriz, fila, i, j);
        }

    }
}
