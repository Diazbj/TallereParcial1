package org.example.Preparcial1.Gonzalo;

import java.util.ArrayList;

public class EdadPersonas {

    public static void main(String[] arg){
        int[][] matriz={{5,7,1,3},{6,45,13,89},{2,28,496,8128},{11,4,8,89},{31,37,43,10}};
        ArrayList<Integer> listaPr=new ArrayList<Integer>();
        ArrayList<Integer> listaPe=new ArrayList<Integer>();
        reccorerMatriz(matriz,matriz.length-1,0,listaPr,listaPe);
        printList(listaPr,0);
        System.out.println("-----------------------");
        printList(listaPe,0);
    }

    //numerosPrimos
    public static boolean esPrimo(int num,int cont,int div){
        if(num==1){
            return false;
        }
        if(cont>2){
            return false;
        }
        if(num%div==0){
            cont+=1;
        }
        if(num==div&&cont==2){
            return true;
        }
        return esPrimo(num,cont,div+1);
    }

    //numero perfecto
    public static boolean esPerfecto(int num, int div,int suma){
        if(num==div){
            return false;
        }
        if(num%div==0){
            suma=suma+div;
        }
        if(num==div+1&&suma==num){
            return true;
        }
        return esPerfecto(num,div+1,suma);
    }
    //recorrer matriz Filas retrocediendo columnas avanzando

    public static void reccorerMatriz(int[][] matriz, int i, int j, ArrayList<Integer> listaPrimos,ArrayList<Integer> listaPerfectos){
        if(i<0){
            return;
        }
        if(esPrimo(matriz[i][j],0,1)){
            listaPrimos.add(matriz[i][j]);
        }else if(esPerfecto(matriz[i][j],1,0)){
            listaPerfectos.add((matriz[i][j]));
        }
        if(j==matriz[i].length-1){
            reccorerMatriz(matriz, i-1, 0, listaPrimos, listaPerfectos);
        }else {
            reccorerMatriz(matriz, i, j + 1, listaPrimos, listaPerfectos);
        }
    }
    public static void printList(ArrayList<Integer> lista,int index){
        if(index==lista.size()){
            return;
        }
        System.out.println(lista.get(index));
        printList(lista,index+1);
    }
}

