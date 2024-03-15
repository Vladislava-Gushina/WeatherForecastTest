package org.vladislava_g.weatherforecasttest.backgroundView;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SecondViewController {
    @FXML
    private AnchorPane contentAnchorPane;
    @FXML
    private Button closeButton;
    @FXML
    void initialize(){
       initBackground();
       initCloseButton();
    }
    private void initBackground(){
        BackgroundUtil.applyBackground(contentAnchorPane, "background/weatherFiveDays.jpeg");
    }

    private void initCloseButton(){
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
    };
}

