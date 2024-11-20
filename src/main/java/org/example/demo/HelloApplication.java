package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TarjetaApp.fxml"));
            VBox root = loader.load();

            // Configurar la escena
            Scene scene = new Scene(root, 400, 300);
            stage.setScene(scene); // Cambiar "primaryStage" por "stage"
            stage.setTitle("Leer Tarjetas desde JSON");
            stage.show(); // Mostrar la ventana
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(); // Iniciar la aplicación
    }
}
