package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> paises = Arrays.asList(
                        "España", "México", "Argentina", "Francia", "Italia",
                        "Alemania", "Portugal", "Chile", "Colombia", "Perú");


        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("a"))
                .forEach(System.out::println);

    }
}