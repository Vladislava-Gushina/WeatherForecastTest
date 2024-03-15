package org.vladislava_g.weatherforecasttest.backgroundView;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.vladislava_g.weatherforecasttest.LoaderSceneUtil;
import org.vladislava_g.weatherforecasttest.url.WeatherParser;
import org.vladislava_g.weatherforecasttest.url.URLParser;


public class FirstViewController {

    @FXML
    private ImageView button;

    @FXML
    private HBox mainHBox;

    @FXML
    private TextField textField;

    @FXML
    void initialize() {
       initBackground();
       initButton();
       initTextField();
    }
    private void initBackground(){

        BackgroundUtil.applyBackground(mainHBox, "background/background.jpeg");
    }

    private void initButton(){
        button.setOnMouseClicked(mouseEvent -> onNext());
    }
    private void onNext(){
        System.out.println("Search for cities...");
        LoaderSceneUtil.loadScene("weather-display.fxml", "Weather display");
        WeatherParser.parseJSON(URLParser.parseURL("http://api.openweathermap.org/data/2.5/weather?q=" + textField.getText().trim() + "&appid=" + "5f5eb59c34ce60626f2d3d2c3aea4cd4"));
        ((Stage) button.getScene().getWindow()).close();
    }

    private void initTextField(){
        textField.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER)
                onNext();
        });
    }

}
