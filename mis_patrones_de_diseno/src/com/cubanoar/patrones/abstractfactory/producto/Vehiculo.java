package com.cubanoar.patrones.abstractfactory.producto;

abstract public class Vehiculo {
    protected String marca, color;
    protected int fabricacion;


    abstract public void ensamblar();

    abstract public void colorPintura();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehiculo{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", fabricacion=").append(fabricacion);
        sb.append('}');
        return sb.toString();
    }
}
