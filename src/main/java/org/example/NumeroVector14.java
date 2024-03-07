package org.example;

public class NumeroVector14 {

    public static void main(String[] args){

        int[] vector={3,3,3,4,1,2,3};
        int elementos= vector.length;
        int n=3;
        int i=0;
        System.out.println(buscarElemento(vector,elementos,n,i));
    }

    private static int buscarElemento(int[] vector, int elementos, int n, int i) {
        if(i>=elementos){
            return 0;

        }else{
            if(vector[i]==n){

                return buscarElemento(vector, elementos, n, i+1)+1;

            }
            return buscarElemento(vector, elementos, n, i+1);
        }
    }
}
