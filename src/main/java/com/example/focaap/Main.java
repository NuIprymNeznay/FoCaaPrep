package com.example.focaap;

import com.example.focaap.controller.FieldPiles;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Main extends Application {
    public static Stage stage;


    public void addFieldPilesInMainStage(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FieldPiles.fxml"));

        FieldPiles fp = loader.getController();
        Stage fpStage = new Stage();
        fpStage.setScene(new Scene(loader.load()));
        fpStage.initOwner(stage);
        fpStage.show();
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("/com/example/focaap/faceApp.fxml"));

        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(fxmlLoader2.load(),sSize.getWidth() -18 , sSize.getHeight() - 75);
        stage.setTitle("FoCaAp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}