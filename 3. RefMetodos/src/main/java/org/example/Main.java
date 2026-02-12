package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    //Referencia a un método de instancia de un objeto arbitrario
    List<Persona> personas = new ArrayList<>();
    personas.add(new Empleado());
    personas.add(new Gerente());
    personas.add(new Empleado());
    personas.add(new Gerente());

    personas.forEach(Persona::saludar);

    }
}