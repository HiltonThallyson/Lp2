package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label mensagem;

    @FXML
    private Button firstButton;

    @FXML
    void pressingButton(ActionEvent event) {
        mensagem.setText("Deu certo mizeravi!");
    }
}
