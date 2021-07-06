package com.cubanoar.patrones.abstractfactory.fabricas;

import com.cubanoar.patrones.abstractfactory.producto.*;

abstract public class FabricaAbstract {


    public Vehiculo comprarVehiculo(String modelo){
        Vehiculo v = crearVehiculo(modelo);
        v.ensamblar();
        v.colorPintura();
        return v;
    }

    abstract Vehiculo crearVehiculo(String modelo);
}
