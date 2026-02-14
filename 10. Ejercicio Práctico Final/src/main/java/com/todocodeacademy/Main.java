package com.todocodeacademy;

import com.todocodeacademy.logica.Producto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Lista de productos
        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", "frutas", 1, 2.5),
                new Producto("Leche", "lácteos", 2, 1.2),
                new Producto("Pan", "panadería", 5, 1.0),
                new Producto("Yogur", "lácteos", 3, 1.8),
                new Producto("Pera", "frutas", 4, 3.0),
                new Producto("Naranja", "frutas", 6, 2.0),
                new Producto("Queso", "lácteos", 2, 3.5),
                new Producto("Manteca", "lácteos", 1, 2.2),
                new Producto("Harina", "panadería", 3, 1.5),
                new Producto("Arroz", "alimentos", 4, 1.8),
                new Producto("Tomate", "frutas", 5, 1.2),
                new Producto("Lechuga", "verduras", 2, 0.9),
                new Producto("Pescado", "pescadería", 1, 4.0),
                new Producto("Pollo", "carnes", 3, 5.0),
                new Producto("Carne", "carnes", 2, 6.5)
        );

        // 1. Filtrar productos de la categoría "frutas"
        List<Producto> frutas = productos.stream()
                .filter(p -> p.getCategoria().equals("frutas"))
                .collect(Collectors.toList());

        System.out.println("Productos que son frutas: " + frutas);

        // 2. Calcular el precio total de los productos en "lácteos"
        double totalLacteos = productos.stream()
                .filter(p -> p.getCategoria().equals("lácteos"))
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println("La suma total de los precios de los lácteos es: " + totalLacteos);

        // 3. Obtener el producto con el precio más bajo
                Producto prodMasBarato = productos.stream()
                        .min(Comparator.comparingDouble(Producto::getPrecio))
                        .orElse(null);

                System.out.println("\n3. El producto más barato es: " + prodMasBarato);


        // 4. Agrupar productos por categoría
        Map<String, List<Producto>> prodPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));

        System.out.println("\n4. Productos agrupados por categoría: " + prodPorCategoria);

        // 5. Calcular el precio promedio de los productos por categoría
        Map<String, Double> promedioPorCategoria = productos.parallelStream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(p -> p.getPrecio())
                ));

        System.out.println("\n5. El precio por categoría es: " + promedioPorCategoria);


        // 6. Obtener la categoría con el precio promedio más alto
        String categoriaMasCara = promedioPorCategoria.entrySet()
                .parallelStream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("No disponible");

        System.out.println("\n6. Categoría con el precio promedio más alto es: " + categoriaMasCara);



    }
}