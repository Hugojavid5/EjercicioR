package org.hugo.ejercicior;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Clase principal de la aplicación que inicia la interfaz de usuario para el formulario con temporizador.
 */
public class FormularioApp extends Application {

    /**
     * Método principal de inicio de la aplicación JavaFX.
     * Carga el archivo FXML y configura la escena principal.
     *
     * @param stage La ventana principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FormularioApp.class.getResource("/Formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Formulario con Temporizador");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método main que lanza la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Application.launch();
    }
}
