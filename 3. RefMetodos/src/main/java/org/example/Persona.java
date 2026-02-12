package org.example;

public class Persona {

    String nombre;
    double estatura;

    public Persona() {
    }

    public Persona(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public void saludar () {
        System.out.println("Hola mi nombre es: " + nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                '}';
    }
}
