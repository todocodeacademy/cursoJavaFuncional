package com.todocodeacademy;

import com.todocodeacademy.logica.Mensajero;

public class Main {
    public static void main(String[] args) {

        Mensajero lambdaMsje = (nombre, edad) -> {
            System.out.println("Hola desde lambda " + nombre);
            System.out.println("Su edad es: " + edad);
        };
        lambdaMsje.emitirMensaje("Luisina", 33);
    }
}