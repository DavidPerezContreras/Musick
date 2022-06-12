package org.iesmurgi.proyectolevidaviddam.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.iesmurgi.proyectolevidaviddam.Middleware.MailBot;

public class RecoveryController {

    @FXML
    private TextField email;

    @FXML
    private Button sendDataButton;

    /**
     * Método que llama a la clase de MiddleWare MailBot para enviar el correo de recuperación
     * @param event
     */
    @FXML
    void sendData(ActionEvent event) {
        MailBot mailBot = new MailBot();
        mailBot.sendMail(email.getText());
        email.clear();
    }

}
