package org.example;

public class PotenciaDosNumeros18 {
    public static void main(String[] args){

        int n=27;
        int b=3;

        System.out.println(esPotencia(n,b));
    }

    private static boolean esPotencia(int n, int b) {

        if(n==1){
            return true;
        }
        if(n%b!=0||n==0){
            return false;
        }
        return esPotencia(n/b, b);
    }
}
