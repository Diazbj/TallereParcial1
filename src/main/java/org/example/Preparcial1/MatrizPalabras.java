package org.example.Preparcial1;

import java.util.ArrayList;
import java.util.List;

public class MatrizPalabras {

    public static void main(String[] args) {
        String[][] matriz = {{"vacio", "carro", "baul", "perro"},
                {"colombia", "casa", "moto", "caza"},
                {"llanta", "reir", "archivo", "silla"},
                {"cocina", "ola", "ave", "freir"}};

        List<String> palabras = new ArrayList<>();
        System.out.println(recorrerMatriz(matriz, 0, 0, palabras));
    }

    public static List<String> recorrerMatriz(String[][] matriz, int i, int j, List<String> palabras) {
        if (i == matriz.length || j == matriz[i].length) {
            return palabras;
        } else {
            System.out.print(" " + matriz[i][j]);
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                System.out.println("");
            } else {
                if (verificarVocalesSeguidas(matriz[i][j], 0, 0)) {
                    palabras.add(matriz[i][j]);
                }
                j++;
            }
            return recorrerMatriz(matriz, i, j, palabras);
        }
    }

    public static boolean verificarVocalesSeguidas(String palabra, int contador, int i) {
        if (i == palabra.length()) {
            return false;
        } else {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'I'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'u' || palabra.charAt(i) == 'U') {
                if (contador < 2) {
                    contador++;
                    if (contador == 2) {
                        return true;
                    }
                    return verificarVocalesSeguidas(palabra, contador, i + 1);
                } else {
                    return true;
                }
            } else if (contador == 1) {
                contador = 0;
                return verificarVocalesSeguidas(palabra, contador, i + 1);
            }
            return verificarVocalesSeguidas(palabra, contador, i + 1);
        }
    }
}