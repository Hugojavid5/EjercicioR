package org.hugo.ejercicior;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;

public class FormularioController implements Initializable {
    @FXML
    private Button btnEnviar1;
    @FXML
    private Button btnEnviar2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (temporizador.setSegundos(20)) {
            temporizador.iniciar();
            temporizador.finProperty().addListener(new ChangeListener<Object>() {
                @Override
                public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
                    //código con las instrucciones a realizar
                    deshabilitarBotones();
                }
            });
        } else {
            deshabilitarBotones();
            alerta("No se ha podido iniciar el temporizador");
        }
    }

    public void deshabilitarBotones() {
        btnEnviar1.setDisable(true);
        btnEnviar2.setDisable(true);
    }
    @FXML
    void enviar(ActionEvent event) {
        confirmacion("Enviado");
    }
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("Error");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }
    /**
     * Función que muestra un mensaje de confirmación al usuario
     *
     * @param texto contenido del mensaje
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

}