package org.example;

public class Main {
    public static void main(String[] args) {

        //resuelto con clases anónimas
        Operador suma = new Operador () {
            @Override
            public int operar(int num1, int num2) {
                return num1+num2;
            }
        };

        System.out.println("Suma anónima " + suma.operar(3,5));

        //resuelto con lambdas
        Operador suma2 = (num1,num2) -> num1+num2;
        System.out.println("Suma Lambda " + suma2.operar(4,5));
    }
}