package com.cubanoar.patrones.abstractfactory.producto;

public class ModeloArgentinoActual extends Vehiculo{

    public ModeloArgentinoActual() {
        super();
        marca = "Toyota";
        fabricacion = 2020;
        color = "Negro";

    }

    @Override
    public void ensamblar() {
        System.out.println("Demora de 3 meses y es el Modelo Actual");
    }

    @Override
    public void colorPintura() {
        System.out.println("Color " + this.color);
    }

}
