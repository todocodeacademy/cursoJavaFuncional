package com.todocodeacademy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //No te olvides de suscribirte a TodoCode ;)
        //www.todocodeacademy.com/cursos

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Stream secuencial
        long tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).forEach((int n) -> System.out.println("Secuencial " + n));
        long tiempoFin = System.nanoTime();
        System.out.println("Tiempo secuencial: " + (tiempoFin - tiempoInicio) + " nanosegundos");

        // Parallel Stream
        tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).parallel().forEach((int n) -> System.out.println("Paralelo " + n));
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo paralelo: " + (tiempoFin - tiempoInicio) + " nanosegundos");


    }
}