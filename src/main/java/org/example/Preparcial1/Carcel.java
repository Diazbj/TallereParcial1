package org.example.Preparcial1;

public class Carcel {
    
    public static void main(String[] args) {
        Carcel c = new Carcel();
        c.carcel[5][7] = 'c';
        c.resolver(0, 0);

        if(26-contarPreso<=0){
            System.out.println("No se escaparon presos");
        }else {
            System.out.println("la cantida de presos que escaparon son:  " + (26 - contarPreso));
        }



        // imprimir matriz
        System.out.println(c.imprimirCarcel());
    }

        public static int contarPreso;
        public static char[][] carcel = {
                {' ', 'p', 'p', ' ', 'p', 'p', ' ', 'p'},
                {' ', 'p', 'p', ' ', 'p', 'p', ' ', 'p'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'p', ' ', 'p', 'p', ' ', 'p', 'p', ' '},
                {'p', ' ', 'p', 'p', ' ', 'p', 'p', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'p', 'p', 'p', ' ', 'p', 'p', ' ', 'p'},
        };

        public void resolver ( int x, int y){
            if (contarPresos(x, y)) {
                carcel[0][0] = 'S';
            }
        }

        public static boolean contarPresos ( int x, int y){

            if (x < 0 || x > carcel.length - 1 || y < 0 || y > carcel[x].length - 1) {
                return false;
            }

            if (carcel[x][y] == 'p') {
                contarPreso++;
                carcel[x][y] = 'P';
                return false;

            }
            if (carcel[x][y] == 'x' || carcel[x][y] == '*' || carcel[x][y] == 'c' || carcel[x][y] == 'P') {
                return false;
            }

            carcel[x][y] = '*';
            //System.out.println(imprimirCarcel());


            contarPresos(x, y + 1);

            contarPresos(x + 1, y);

            contarPresos(x - 1, y);

            contarPresos(x, y - 1);

            return false;
        }
        private static String imprimirCarcel()
        { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
            String salida = "";    // un método toString para arrays bidimensionales, lo programamos a mano
            for (int x = 0; x < carcel.length; x++) { // recorremos filas
                for (int y = 0; y < carcel[x].length; y++) { // recorremos columnas
                    salida += carcel[x][y] + " "; // output es nuestra variable que va almacenando los valores a imprimir
                }
                salida += "\n"; // devolvemos esta variable con un salto de línea
            }
            return salida;
        }

}

