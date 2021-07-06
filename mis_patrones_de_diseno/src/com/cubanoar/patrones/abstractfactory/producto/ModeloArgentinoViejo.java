package com.cubanoar.patrones.abstractfactory.producto;

public class ModeloArgentinoViejo extends Vehiculo{

    public ModeloArgentinoViejo() {
        super();
        marca = "Renault";
        fabricacion = 2000;
        color = "verde";

    }

    @Override
    public void ensamblar() {
        System.out.println("Demora de 3 meses y es modelo Viejo");
    }

    @Override
    public void colorPintura() {
        System.out.println("Color " + this.color);
    }

}
