package com.lhamfor.practicas;

public class Carro {
    private String nombre;
    private char modelo;
    private short placa;
    private int precio;
    private long fechaFabricaion;
    private float impuesto;
    private double metros;
    private boolean hipoteca;

    public Carro(String nombre, char modelo, short placa, int precio, long fechaFabricaion, float impuesto, double metros, boolean hipoteca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.placa = placa;
        this.precio = precio;
        this.fechaFabricaion = fechaFabricaion;
        this.impuesto = impuesto;
        this.metros = metros;
        this.hipoteca = hipoteca;
    }

    public Carro(String nombre, short placa, int precio, boolean hipoteca) {
        this.nombre = nombre;
        this.placa = placa;
        this.precio = precio;
        this.hipoteca = hipoteca;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nombre='" + nombre + '\'' +
                ", modelo=" + modelo +
                ", placa=" + placa +
                ", precio=" + precio +
                ", fechaFabricaion=" + fechaFabricaion +
                ", impuesto=" + impuesto +
                ", metros=" + metros +
                ", hipoteca=" + hipoteca +
                '}';
    }
}
