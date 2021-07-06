package com.cubanoar.patrones.abstractfactory.fabricas;

import com.cubanoar.patrones.abstractfactory.producto.ModeloAlemanGasOil;
import com.cubanoar.patrones.abstractfactory.producto.ModeloAlemanNafta;
import com.cubanoar.patrones.abstractfactory.producto.Vehiculo;

public class FabricaAlemana extends FabricaAbstract {



    @Override
    Vehiculo crearVehiculo(String modelo) {
        Vehiculo v = null;
        switch (modelo){
            case "nafta":
                v = new ModeloAlemanNafta();
                break;
            case "gasoil":
                v = new ModeloAlemanGasOil();
                break;
            default:
                System.out.println("Modelo no encontrado");
        }
        return v;
    }


}
