package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoFXApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loginLoader = new FXMLLoader(DemoFXApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(loginLoader.load(), 320, 240);
        stage.setTitle("Login - FX");
        stage.setScene(scene);
        stage.show();

        LoginController loginController = loginLoader.getController();
        loginController.setPrimaryStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}