package org.example.demo.integrador;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.demo.dominio.Tarjeta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class IntegradorFileSystem {

    public IntegradorFileSystem() {
    }

    public List<Tarjeta> readTarjetasFromJson() throws FileNotFoundException {
        String path = "src/main/resources/tarjetas.json";
        try (Reader reader = new FileReader(path)) {
            Gson gson = new Gson();
            Type tarjetaListType = new TypeToken<List<Tarjeta>>() {}.getType();
            List<Tarjeta> tarjetas = gson.fromJson(reader, tarjetaListType);
            tarjetas.forEach(tarjeta ->
                    System.out.println("Nombre: " + tarjeta.getNombre() + ", Precio: " + tarjeta.getPrecio())
            );
            return tarjetas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
