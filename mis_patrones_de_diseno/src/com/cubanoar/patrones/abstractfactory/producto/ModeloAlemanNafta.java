package com.cubanoar.patrones.abstractfactory.producto;

public class ModeloAlemanNafta extends Vehiculo {
    private String color;

    public ModeloAlemanNafta() {
        super();
        marca = "Mercedez Benz";
        fabricacion = 2010;
        color = "Blanco";

    }

    @Override
    public void ensamblar() {
        System.out.println("Demora de 1 meses y funciona con NAFTA");
    }

    @Override
    public void colorPintura() {
        System.out.println("Color " + this.color);
    }
}
