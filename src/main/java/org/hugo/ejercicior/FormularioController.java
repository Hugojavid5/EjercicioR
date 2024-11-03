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

/**
 * Controlador para el formulario de la interfaz de usuario.
 * Gestiona la funcionalidad del temporizador y los botones de envío.
 */
public class FormularioController implements Initializable {

    /**
     * Número de segundos para configurar el temporizador.
     */
    private static final int SEGUNDOS = 20;

    @FXML
    private Temporizador temporizador;

    @FXML
    private Button btnEnviar1;
    @FXML
    private Button btnEnviar2;

    /**
     * Método de inicialización que se ejecuta al cargar el controlador.
     * Configura el temporizador e inicia su cuenta regresiva.
     *
     * @param url URL de localización.
     * @param resourceBundle Conjunto de recursos para la localización.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (temporizador.setSegundos(SEGUNDOS)) {
            temporizador.iniciar();
            temporizador.finProperty().addListener(new ChangeListener<Object>() {
                @Override
                public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
                    // Código con las instrucciones a realizar al finalizar el temporizador
                    deshabilitarBotones();
                }
            });
        } else {
            deshabilitarBotones();
            alerta("No se ha podido iniciar el temporizador");
        }
    }

    /**
     * Deshabilita ambos botones de envío para impedir su uso.
     */
    public void deshabilitarBotones() {
        btnEnviar1.setDisable(true);
        btnEnviar2.setDisable(true);
    }

    /**
     * Maneja el evento de envío. Detiene el temporizador,
     * muestra un mensaje de confirmación y deshabilita los botones de envío.
     *
     * @param event Evento de acción de envío.
     */
    @FXML
    void enviar(ActionEvent event) {
        temporizador.detener();
        confirmacion("Enviado");
        deshabilitarBotones();
    }

    /**
     * Muestra una alerta de error al usuario.
     *
     * @param texto Contenido del mensaje de error.
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("Error");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Muestra un mensaje de confirmación al usuario.
     *
     * @param texto Contenido del mensaje de confirmación.
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }
}
