package com.reinhart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoMainController {
    @FXML
    private Label lblOutput;
    @FXML
    private TextField txtInput;

    @FXML
    private void sendAction(ActionEvent actionEvent) {
        if (!txtInput.getText().trim().isEmpty()){
            lblOutput.setText(txtInput.getText().trim());
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please Fill Input");
            alert.showAndWait();
        }
    }
}
