package org.example.demo.dominio;

public class Linea {
    private int cantidad;
    private Tarjeta tarjeta;

    public Linea() {
    }

    public Linea(int cantidad, Tarjeta tarjeta) {
        this.cantidad = cantidad;
        this.tarjeta = tarjeta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public double calcularSubtotal() {
        return tarjeta.getPrecio() * cantidad;
    }

}
