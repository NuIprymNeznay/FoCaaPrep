package com.example.focaap.controller;

import com.example.focaap.Main;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.parallel.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FaceAppContrl implements Initializable {

    private FieldPiles fp;

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

    String strin = "";

    @FXML
    protected void tabsAdd() {
        try {
            Stage stage = Main.stage;

            //ПРОВЕРЯЙ ЭТОТ ЕБУЧИЙ ПУТЬ ВЕЧНО КАКАЧЯ ТО ХЕТА
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/com/example/focaap/FieldPiles.fxml"));
            System.out.println(loader.toString());
            Pane pane = loader.load();
            Scene as = new Scene(pane);
            stage.setScene(as);
            stage.show();
            Stage fpStage = new Stage();
            fpStage.setScene(new Scene(new Pane()));
            fpStage.initOwner(stage);
            fpStage.show();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
        tFi.setOnKeyPressed(x -> {
            if (x.getCode() == KeyCode.SHIFT)  {
                strin = tFi.getText();
                System.out.println(strin);
            }
        });
    }
}
