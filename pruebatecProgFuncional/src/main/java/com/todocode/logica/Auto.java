package com.todocode.logica;

public class Auto {
    private String marca;
    private String modelo;
    private double costo;

    public Auto() {
    }

    public Auto(String marca, String modelo, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - $" + costo;
    }
}
