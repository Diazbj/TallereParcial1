package org.example.Preparcial1.Gonzalo;

import java.util.ArrayList;

public class MatrizPalabras {
    public static ArrayList<String> arregloPalabras;
    public static String[][] matiz={{"vacio","carro","baul","perro"},
            {"colombia","casa","moto","caza"},
            {"llanta","reir","archivo","silla"},
            {"cocina","ola","ave","freir"}};
    public static ArrayList<String> listaPalabras=new ArrayList<String>();

    public static void main(String[] args) {
        recorrerMatriz1(matiz,0,0,listaPalabras);
        for (String p :listaPalabras){
            System.out.println(p);
        }
    }

    public static ArrayList<String> recorrerMatriz1 (String[][] matriz, int i, int j, ArrayList<String>listaPalabras) {

        if(i==matriz.length){
            return listaPalabras;
        }
        String palabra=matriz[i][j];
        if(verificarVocales(palabra,0,0)){
            listaPalabras.add(palabra);
        }

        if(j==matriz[i].length-1){
            return recorrerMatriz1(matriz,i+1,0,listaPalabras);
        }
        return recorrerMatriz1(matriz,i,j+1,listaPalabras);
    }

    public static boolean verificarVocales(String palabra,int indice,int cont) {

        if (cont == 2) {
            return true;
        }
        if (indice == palabra.length()) {
            return false;
        }
        if (palabra.charAt(indice) == 'a' || palabra.charAt(indice) == 'e' || palabra.charAt(indice) == 'i'
                || palabra.charAt(indice) == 'o' || palabra.charAt(indice) == 'u') {
            return verificarVocales(palabra, indice + 1, cont+1);
        }
        return verificarVocales(palabra,indice+1,0);
    }
}



