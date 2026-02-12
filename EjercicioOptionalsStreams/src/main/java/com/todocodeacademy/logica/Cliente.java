package com.todocodeacademy.logica;

public class Cliente {

    private Long nro_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Cliente() {
    }

    public Cliente(Long nro_cliente, String nombre, String apellido, String direccion, String telefono) {
        this.nro_cliente = nro_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getNro_cliente() {
        return nro_cliente;
    }

    public void setNro_cliente(Long nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nro_cliente=" + nro_cliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
