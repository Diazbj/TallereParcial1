package org.example;

public class NumeroMenorArreglo {

    public static void main(String[] args){
        int indice=0;

        int[] arreglo={9,3,2,12,12};

        int Menor=NumeroMenor(arreglo,indice);

        System.out.println(Menor);
        System.out.println(arreglo[Menor]);

    }

    public static int NumeroMenor(int[] arreglo,int indice) {

        if(indice==arreglo.length-1){
            return indice;
        }else{
            int menorRestante = NumeroMenor(arreglo,indice+1);
            if(arreglo[indice]<=arreglo[menorRestante]){

                return indice;

            }else{

                return menorRestante;

            }
        }

    }

}
