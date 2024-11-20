package org.example.demo.dominio;

public class Pago {
    private int cantidad;
    private float denominacion;

    public Pago() {
    }

    public Pago(int cantidad, float denominacion) {
        this.cantidad = cantidad;
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(float denominacion) {
        this.denominacion = denominacion;
    }
}
