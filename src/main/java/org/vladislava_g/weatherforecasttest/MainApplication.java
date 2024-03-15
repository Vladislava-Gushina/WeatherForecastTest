package org.vladislava_g.weatherforecasttest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setResizable(false);
        stage.setTitle("𝓦𝓮𝓪𝓽𝓱𝓮𝓻 𝓕𝓸𝓻𝓮𝓬𝓪𝓼𝓽");
        stage.setScene(scene);
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/iconWeather.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}