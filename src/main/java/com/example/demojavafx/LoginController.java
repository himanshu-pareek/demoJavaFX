package com.example.demojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Text loginMessage;

    @FXML
    private Button buttonLogin;

    public void login(ActionEvent event) throws IOException {
        Scene currentScene = buttonLogin.getScene();
        Stage stage = (Stage) currentScene.getWindow();
        stage.setTitle("Dashboard");

        FXMLLoader fxmlLoader = new FXMLLoader(DemoFXApplication.class.getResource("dashboard.fxml"));
        Scene dashboardScene = new Scene(fxmlLoader.load());
        stage.setScene(dashboardScene);
    }
}