package com.cubanoar.patrones.abstractfactory.fabricas;

import com.cubanoar.patrones.abstractfactory.producto.ModeloArgentinoActual;
import com.cubanoar.patrones.abstractfactory.producto.ModeloArgentinoProximo;
import com.cubanoar.patrones.abstractfactory.producto.ModeloArgentinoViejo;
import com.cubanoar.patrones.abstractfactory.producto.Vehiculo;

public class FabricaArgentina extends FabricaAbstract{
    @Override
    Vehiculo crearVehiculo(String modelo) {
        Vehiculo v = null;
        switch (modelo){
            case "viejo":
                v = new ModeloArgentinoViejo();
                break;
            case "actual":
                v = new ModeloArgentinoActual();
                break;
            case "proximo":
                v = new ModeloArgentinoProximo();
                break;
            default:
                System.out.println("No existe el modelo");

        }

        return v;
    }
}
