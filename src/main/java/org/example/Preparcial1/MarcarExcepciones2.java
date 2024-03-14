package org.example.Preparcial1;

public class MarcarExcepciones2 {

    private static void funcionY() {
        //bloque 1
        //bloque 2
        try {
            //bloque3
            //bloque4
        } catch (ArithmeticException e) {
            //bloque 13
        } catch (NumberFormatException e) {
            //bloque 15
        } catch (Exception e) {
            //bloque 5
            try {
                //bloque6
                //bloque7
            } catch (Exception e1) {
                //bloque8
            } finally {
                //bloque 9
            }
            //bloque 10
        } finally {
            //bloque 11
        }
//bloque 12
    }
}