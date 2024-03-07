package org.example;

public class ContarCerosArreglo2 {

    public static void main(String[] args){

        int indice=0;
        int[] arreglo = {1, 2, 0, 4, 0};

        int ceros=ContarCeros(arreglo,indice);

        System.out.println(ceros);

    }

    public static int ContarCeros(int[] arreglo,int indice){

        if(indice==arreglo.length){
            return 0;
        }else{
            if(arreglo[indice]==0){
                return ContarCeros(arreglo,indice+1)+1;
            }else{
                return ContarCeros(arreglo,indice+1);
            }
        }
    }

}
