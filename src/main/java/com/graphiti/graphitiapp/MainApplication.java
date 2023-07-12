package com.graphiti.graphitiapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class MainApplication extends Application {
    private static final Logger logger = LogManager.getLogger(Controller.class);

    private Controller controller;


    @Override
    public void start(Stage stage) throws IOException {
        logger.info("Main application running.");
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Graphiti Image Analyzer");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setMaximized(true);
        stage.setMinWidth(320);
        stage.setMinHeight(240);
        stage.show();
        controller = fxmlLoader.getController();
    }

    @Override
    public void stop() {
        if (controller != null) {
            controller.shutdown();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
