package org.example.demo.negocio;

import org.example.demo.dominio.Compra;
import org.example.demo.dominio.Tarjeta;
import org.example.demo.integrador.IntegradorFileSystem;

import java.util.ArrayList;
import java.util.List;

public class NegocioCompra implements INegocioCompra{

    private List<Tarjeta> catalogo;
    private Compra compraActual;
    private IntegradorFileSystem integrador;

    public NegocioCompra() {
        this.catalogo = new ArrayList<>();
        compraActual = new Compra();
        integrador = new IntegradorFileSystem();
    }
}
