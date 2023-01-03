package com.example.focaap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Pane playButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void tabsAdd() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}