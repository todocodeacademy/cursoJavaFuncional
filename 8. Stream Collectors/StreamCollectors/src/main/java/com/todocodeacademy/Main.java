package com.todocodeacademy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //No te olvides de suscribirte a TodoCode ;)
        //www.todocodeacademy.com/cursos

        // Collectors.toList
        List<String> nombres = List.of("Luisina", "Ibra", "Suscribite", "TodoCode");

        List<String> nombresConA = nombres.stream()
                .filter((String n) -> n.contains("a"))
                .collect(Collectors.toList());

        System.out.println(nombresConA);

        // Collectors.toSet
        List<String> lenguajes = List.of("java", "python", "java", "PHP", "javascript");

        Set<String> sinRepetidos = lenguajes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(sinRepetidos);

        // Collectors.joining()
        List<String> sgbds = List.of("MySQL", "Oracle", "PostgreSQL");

        String listaTecnologias = sgbds.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | "));

        System.out.println(listaTecnologias);

        // Collectors.counting()
        List<String> paises = List.of("Lituania", "España", "Argentina", "Laos", "Perú", "México");

        Long cantidadConL = paises.stream()
                .filter(n -> n.startsWith("L"))
                .collect(Collectors.counting());

        System.out.println("Cantidad de países con L: " + cantidadConL);

        // Collectors.partitioningBy()
        List<Integer> edades = List.of(13, 15, 20, 21, 35, 33, 32, 48, 57, 12, 10);

        Map<Boolean, List<Integer>> mayores = edades.stream()
                .collect(Collectors.partitioningBy(e -> e >= 18));

        System.out.println(mayores);

    }
}