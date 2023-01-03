package com.example.focaap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("faceApp.fxml"));
        Scene scene = new Scene(fxmlLoader2.load(), 320, 240);
        stage.setTitle("FoCaAp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}