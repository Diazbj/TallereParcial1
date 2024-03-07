package org.example;

public class SumaDeCifras4 {

    public static void main(String[] args){

        int numero= 45879632;

        int suma=SumaCifras(numero);

        System.out.println(suma);

    }

    public static int SumaCifras(int numero){

        if(numero==0){
            return 0;
        }else{
            return SumaCifras(numero/10)+numero%10;
        }


    }

}
