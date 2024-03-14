package org.example.Preparcial1.PersonasEdad;

public class Persona {

    public String Nombre;
    public String apellido;
    public int edad;

    public Persona(){

    }

    public Persona(String nombre, String apellido, int edad) {
        Nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

