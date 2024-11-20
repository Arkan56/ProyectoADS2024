module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens org.example.demo.view to javafx.fxml;
    opens org.example.demo.dominio to com.google.gson;
    exports org.example.demo;
}
