package org.example.Preparcial1;

public class Parqueadero {

    /*
    *Espacio reservado (R)
    *Espacio Libre (L)
    * Espacio ocupado (C)
    * Espacio Discapacitados (D)
    * Espacios reservados (X)(Y)
    * Marcador donde pasa +
    * vacio es pasillo ()
    * Inicio (E)
    * */

    public static String [][] Parqueadero={
            {"L"," ","L","D","X","L"," "},
            {"L"," ","L","C"," ","L"," "},
            {" "," "," ","C"," "," "," "},
            {"C"," "," ","C","D","D"," "},
            {"C"," "," "," "," ","L"," "},
            {"C"," ","C"," "," ","L"," "},
            {"C"," ","C"," ","C","C"," "},
            {" "," ","C"," "," "," "," "},
            {"C"," ","C"," ","C"," ","C"},
            {"C"," ","R"," ","C"," ","R"},
            {" "," ","R"," ","C","C","R"},
            {"E"," ","R"," "," "," ","X"}
    };

    public static int carros=2;

    public static void main(String[] args){

        Parqueadero p =new Parqueadero();
        //p.Parqueadero[11][0]="EN";
        p.resuelve(11, 0);
    }
    public void resuelve(int x, int y){// permite introducir unas coordenadas (x, y)
        for (int i=0;i<carros;i++){
            if (paso(x, y)) { 								// intentará resolver el laberinto en estas coordenadas
                Parqueadero[x][y] = "E"; 						// introduce en las coordenadas (x, y) la entrada
            }
        }

    }

    private boolean paso(int x, int y) {
        if(x<0||y<0||x>Parqueadero.length-1||y> Parqueadero[x].length-1){
            return false;
        }
        if(Parqueadero[x][y]=="X" ){
            Parqueadero[x][y]="C";
            System.out.println(imprimirParqueadero());

        }
        if(Parqueadero[x][y]=="R"||Parqueadero[x][y]=="L"||Parqueadero[x][y]=="D"||Parqueadero[x][y]=="C"||Parqueadero[x][y]=="+"){
            return false;
        }

        Parqueadero[x][y]="+";

        boolean result;
        result=paso(x, y+1); // intentamos ir hacia la DERECHA. Primera llamada recursiva
        if (result){
            Parqueadero[x][y]=" ";

            return true; // si el resultado es el final, entonces el algoritmo termina
        }



        result=paso(x+1, y); // intentamos ir hacia ABAJO. Cuarta llamada recursiva
        if (result){
            Parqueadero[x][y]=" ";

            return true; // si el resultado es el final, entonces el algoritmo termina
        }

        result=paso(x-1, y); // intentamos ir hacia ARRIBA. Segunda llamada recursiva
        if (result){
            Parqueadero[x][y]=" ";

            return true; // si el resultado es el final, entonces el algoritmo termina
        }

        result=paso(x, y-1); // intentamos ir hacia la IZQUIERDA. Tercera llamada recursiva
        if (result){
            Parqueadero[x][y]=" ";

            return true; // si el resultado es el final, entonces el algoritmo termina
        }
        Parqueadero[x][y]=" ";
        return false;
    }
    private String imprimirParqueadero() { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
        String salida = "";    // un método toString para arrays bidimensionales, lo programamos a mano
        for (int x = 0; x< Parqueadero.length; x++) { // recorremos filas
            for (int y = 0; y< Parqueadero[x].length; y++) { // recorremos columnas
                salida += Parqueadero[x][y] + " "; // output es nuestra variable que va almacenando los valores a imprimir
            }
            salida += "\n"; // devolvemos esta variable con un salto de línea
        }
        return salida;
    }

}
