package org.example.demo.dominio;

import java.util.Date;
import java.util.List;

public class Compra {
    private Date fecha;
    private Comprador comprador;
    private List<Linea> lineas;
    private List<Pago> pagos;

    public Compra() {
    }

    public Compra(Date fecha, Comprador comprador, List<Linea> lineas, List<Pago> pagos) {
        this.fecha = fecha;
        this.comprador = comprador;
        this.lineas = lineas;
        this.pagos = pagos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void agregarLinea(Linea linea) {
        lineas.add(linea);
    }

    public void eliminarLinea(int index) {
        lineas.remove(index);
    }

    public double calcularTotal() {
        return lineas.stream().mapToDouble(Linea::calcularSubtotal).sum();
    }

    public List<Linea> getLineas() { return lineas; }
    public void setPagos(List<Pago> pagos) { this.pagos = pagos; }

}
