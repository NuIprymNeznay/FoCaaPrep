package com.example.focaap.controller;

import com.example.focaap.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FieldPiles implements Initializable {
    @FXML
    public AnchorPane ap;
    @FXML
    public Label podpisElement;

    public AnchorPane getApasd() {
        return apasd;
    }

    private AnchorPane apasd;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        apasd = new AnchorPane(podpisElement);
        System.out.println("ПИроги ебать ту люсю");
    }
}
