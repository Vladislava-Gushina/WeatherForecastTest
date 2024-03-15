package org.vladislava_g.weatherforecasttest.backgroundView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.vladislava_g.weatherforecasttest.LoaderSceneUtil;

public class MainViewController {
    @FXML
    private VBox mainVBox;
    @FXML
    private Button buttonNext;
    @FXML
    void initialize() {
       initButton();
       initBackground();
    }
    void initBackground(){
        BackgroundUtil.applyBackground(mainVBox, "/background/weatherMainSecond.jpg");
    }
    private void initButton(){
        buttonNext.setOnMouseClicked(mouseEvent -> {
            LoaderSceneUtil.loadScene("weather-for-five-days.fxml", "Weather for five days");
            ((Stage) buttonNext.getScene().getWindow()).close();
        });
    }
}
