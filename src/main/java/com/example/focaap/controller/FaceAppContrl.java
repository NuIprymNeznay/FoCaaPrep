package com.example.focaap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class FaceAppContrl {
    @FXML
    private Button addTabButton = new Button("давиДОбавляй");

    @FXML
    private AnchorPane vk1;
    @FXML
    private TextField tFi;

    @FXML
    private TabPane tabPane;
    @FXML
    private HBox hBox;

    @FXML
    protected void tabsAdd() {
        hBox.getChildren().add(new Button("давиДОбавляй"));
    }
    @FXML
    protected void initialize() {
        hBox.getChildren().add(addTabButton);
        System.out.println(tFi.getText());
    }
}
