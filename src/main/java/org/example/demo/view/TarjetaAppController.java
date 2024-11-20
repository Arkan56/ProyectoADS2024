package org.example.demo.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import org.example.demo.dominio.Tarjeta;
import org.example.demo.integrador.IntegradorFileSystem;

import java.util.List;

public class TarjetaAppController {

    @FXML
    private Button btnCargar;

    @FXML
    private ListView<String> listView;

    private final IntegradorFileSystem integradorFileSystem;

    // Constructor
    public TarjetaAppController() {
        this.integradorFileSystem = new IntegradorFileSystem();
    }

    @FXML
    public void initialize() {
        // Configurar acción para el botón
        btnCargar.setOnAction(event -> cargarTarjetas());
    }

    private void cargarTarjetas() {
        try {
            // Usar el integrador para leer las tarjetas
            List<Tarjeta> tarjetas = integradorFileSystem.readTarjetasFromJson();

            // Mostrar las tarjetas en el ListView
            listView.getItems().clear();
            tarjetas.forEach(tarjeta -> listView.getItems().add(
                    "Nombre: " + tarjeta.getNombre() + ", Precio: " + tarjeta.getPrecio()
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
