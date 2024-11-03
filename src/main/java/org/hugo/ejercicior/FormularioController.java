package org.hugo.ejercicior;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class FormularioController implements Initializable {
    @FXML
    private Button btnEnviar1;
    @FXML
    private Button btnEnviar2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //
    }

    public void deshabilitarBotones() {
        btnEnviar1.setDisable(true);
        btnEnviar2.setDisable(true);
    }
}