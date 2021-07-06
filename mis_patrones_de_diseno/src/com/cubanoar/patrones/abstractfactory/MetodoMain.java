package com.cubanoar.patrones.abstractfactory;

import com.cubanoar.patrones.abstractfactory.fabricas.FabricaAbstract;
import com.cubanoar.patrones.abstractfactory.fabricas.FabricaAlemana;
import com.cubanoar.patrones.abstractfactory.fabricas.FabricaArgentina;
import com.cubanoar.patrones.abstractfactory.producto.Vehiculo;

public class MetodoMain {

    public static void main(String[] args) {
        FabricaAbstract va = new FabricaArgentina();
        FabricaAbstract valeman = new FabricaAlemana();
        Vehiculo auto = null;


        System.out.println("###################FABRICA ARGENTINA###################");

        auto = va.comprarVehiculo("viejo");
        System.out.println("Auto Viejo = " + auto);
        System.out.println("######################################");
        auto = va.comprarVehiculo("actual");
        System.out.println("Auto Actual = " + auto);
        System.out.println("######################################");
        auto = va.comprarVehiculo("proximo");
        System.out.println("Auto proximo = " + auto);

        System.out.println("###################FABRICA ALEMANA###################");

        System.out.println("######################################");
        auto = valeman.comprarVehiculo("nafta");
        System.out.println("Auto Aleman con NAFTA = " + auto);

        System.out.println("######################################");
        auto = valeman.comprarVehiculo("gasoil");
        System.out.println("Auto Aleman con GASOIL = " + auto);
    }

}
