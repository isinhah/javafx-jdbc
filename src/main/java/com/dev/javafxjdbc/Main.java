package com.dev.javafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
        ScrollPane scrollPane = loader.load();

        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        Scene mainScene = new Scene(scrollPane);
        stage.setScene(mainScene);
        stage.setTitle("App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}