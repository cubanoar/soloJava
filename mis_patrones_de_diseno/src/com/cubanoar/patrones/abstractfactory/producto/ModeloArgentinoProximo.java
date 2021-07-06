package com.cubanoar.patrones.abstractfactory.producto;

public class ModeloArgentinoProximo extends Vehiculo{

    public ModeloArgentinoProximo() {
        super();
        marca = "Audi";
        fabricacion = 2030;
        color = "rojo";

    }

    @Override
    public void ensamblar() {
        System.out.println("Demora de 3 meses y es el proximo Modelo");
    }

    @Override
    public void colorPintura() {
        System.out.println("Color " + this.color);
    }

}
