package com.example.focaap.controller;

import com.example.focaap.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class homeFrameC {
    @FXML
    public VBox vbox1;

    @FXML
    public MenuItem mainButton;
    public MenuItem mainButton2;
    @FXML
    private ChoiceBox choiceBox;

    @FXML
    public void pushNew(){
        System.out.println("New");
    }

    @FXML
    public void framePlus() throws IOException {
        Stage st = new Stage();
        st.initStyle (StageStyle.TRANSPARENT);
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("hello-com.example.focaap.view.fxml"));

        Scene scene = new Scene(fxmlLoader1.load(), 320, 240);

        st.setScene(scene);
        st.show();
    }
}
