package org.example;

public class NumeroDeApariciones5 {

     public static void main(String[] args){
         int[] arreglo={1,1,2,2,2,0,12};

         int elemento=-10;
         int indice=0;

         int apariciones=BuscarElemento(arreglo,elemento,indice);

         System.out.println(apariciones);
     }

    public static int BuscarElemento(int[] arreglo,int elemento,int indice){

         if(indice==arreglo.length){

             return 0;

         }else{
             if(elemento==arreglo[indice]){

                 return BuscarElemento(arreglo,elemento,indice+1)+1;

             }else {
                 return BuscarElemento(arreglo,elemento,indice+1);

             }
         }

    }

}


