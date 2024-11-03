package org.hugo.ejercicior;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class FormularioApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FormularioApp.class.getResource("/Formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Formulario con Temporizador");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }
}