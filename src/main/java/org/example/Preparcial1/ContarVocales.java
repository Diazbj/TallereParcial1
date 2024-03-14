package org.example.Preparcial1;

public class ContarVocales {
    public static void main(String[] args) {
        int indice=0;
        int vocales=contarVocales("holaeuaa",indice);
        System.out.println(vocales);

    }

    public static int contarVocales(String palabra, int indice){

        if(indice==palabra.length()){
            return 0;

        }else{
            if(palabra.charAt(indice)=='a'||palabra.charAt(indice)=='e'||palabra.charAt(indice)=='i'||palabra.charAt(indice)=='o'||palabra.charAt(indice)=='u'){
                return contarVocales(palabra,indice+1)+1;
            }else{
                return contarVocales(palabra,indice+1);
            }
        }
    }

}
