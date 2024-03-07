package org.example;

public class PotenciaNumero12 {

    public static void main(String[] args){

        int i =0;

        System.out.print(CalcularPotencia(2,10,i,1));
    }

    private static int CalcularPotencia(int base, int potencia,int i,int producto ) {

        if(i==potencia){
            return producto;
        }else{
            producto=producto*base;

            return CalcularPotencia(base, potencia, i+1, producto);
        }
    }
}
