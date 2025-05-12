package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> cadena = Optional.empty();

        if (cadena.isEmpty()) {
            System.out.println("es vacía");
        }
        else {
            System.out.println("tiene un valor");
        }



    }
}