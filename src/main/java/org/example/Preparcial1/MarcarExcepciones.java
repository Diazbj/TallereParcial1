package org.example.Preparcial1;

public class MarcarExcepciones {

    private static void funcionX(){
        //Bloque 1
        //Bloque 2
        //Bloque 3

        try{
            //Bloque 4
        }catch (ArithmeticException e){
            //Bloque 5
            //Bloque 6
            try{
                //Bloque 7
            }catch (NullPointerException e2){
                //Bloque 8
            }
            //Bloque 9

            try{
                //Bloque 10
            }catch (ArrayIndexOutOfBoundsException e2){
                //Bloque 11
            }
            //Bloque 12
        }
        catch (ArrayIndexOutOfBoundsException e){
            //Bloque 13
        }
        catch (Exception e){
            //Bloque 14
        }
        finally {
            //Bloque 15
        }
        //Bloque 16
    }
}

/*
* Sin Excepciones: 1->2->3->4->15->16
* Excepcion en el bloque 6: 1->2->3->4*->5->6*->15
* Desbordamiento de un arreglo: 1->2->3->4*->13->15->16
* Desbordamiento de un arreglo:1->2->3->4*->5->6->7->9->10*->11->12->15->16
* Acceso a un objeto null:1->2->3->4*->5->6->7*->8->9->10->12->15->16
* Error de desbordamiento de pila en el bloque 4: 1->2->3->4*->14->15->16 ????
* Excepcion usuario no valido: 1->2->3->4*->14->15->16
* Excepcion en el bloque 16: 1->2->3->4->15->16*
* Excepcion de tipo EnteroEception en el bloque 4: 1->2->3->4*->5->6->7->9->10->12->15->16
* */
