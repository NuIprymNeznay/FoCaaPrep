package com.example.focaap.controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.focaap.Main.stage;

public class GeologContrl implements Initializable {
    public Stage getGeoStage() {
        return geoStage;
    }

    private Stage geoStage = new Stage();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
