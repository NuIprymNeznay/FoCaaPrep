package com.example.focaap.controller;

import com.example.focaap.Main;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.junit.jupiter.api.parallel.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.focaap.Main.stage;

public class FaceAppContrl implements Initializable {
    private GeologContrl GC;
    private FieldPiles fp;
    @FXML
    private Pane paneFaceAppRoot;
    @FXML
    private BorderPane borderPaneFaceApp;
    @FXML
    private MenuBar menuBarFaceApp;

    @FXML
    private Button addTabButton = new Button("давиДОбавляй");
    @FXML
    private Button useGeoStage;
    @FXML
    private AnchorPane vk1;
    @FXML
    private TextField tFi;
    @FXML
    private TabPane tabPane;
    @FXML
    private HBox hBox;
    @FXML
    private VBox vBoxFaceApp;


    @FXML
    private Button buttonVPlate1;
    @FXML
    private Button buttonVPlate2;




    @FXML
    protected void buttonVPlate1M() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/com/example/focaap/Geolog.fxml"));
        try {
            borderPaneFaceApp.setCenter(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("asdasd");
    }

    public double asd = 200.3d;
    @FXML
    protected void useGeoStage() {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/com/example/focaap/Geolog.fxml"));
        try {
            Scene sc = new Scene(fxmlLoader.load());
            Stage geoStage = new Stage();
            geoStage.initStyle(StageStyle.UNDECORATED);
            geoStage.setScene(sc);
            geoStage.initOwner(stage);
            geoStage.show();

            /*Runnable er = (() ->{
                {
                    while (true){
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        asd = asd + 100.9d;
                        paneFaceAppRoot.setPrefWidth(asd);
                        System.out.println(paneFaceAppRoot.getPrefWidth());
                    }
                }
            });
            new Thread(er).start();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
    public double a = 220.0d;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
        //Наш обектик       его свойство     слушает паскуда все изменения этого свойства
        //       |                |                                 |                     Увеличилась ширина = произошли собития которые внутри лямбды
        Main.stage.widthProperty().addListener((observableValue, number, t1) -> {
            //Вся та хуйня которая произойдет если измениться ширина нашего поля
            menuBarFaceApp.setPrefWidth(Main.stage.getWidth());
        });

        tFi.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SHIFT)  {

                System.out.println(tFi.getText());
            }
        });
    }
}
