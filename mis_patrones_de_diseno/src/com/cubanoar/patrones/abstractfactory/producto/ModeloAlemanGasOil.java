package com.cubanoar.patrones.abstractfactory.producto;

public class ModeloAlemanGasOil extends Vehiculo {
    private String color;

    public ModeloAlemanGasOil() {
        super();
        marca = "Volvo";
        fabricacion = 2019;
        color = "Azul";

    }

    @Override
    public void ensamblar() {
        System.out.println("Demora de 2 meses y funciona con GASOIL");
    }

    @Override
    public void colorPintura() {
        System.out.println("Color " + this.color);
    }
}
