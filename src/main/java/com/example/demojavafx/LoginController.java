package com.example.demojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    private Stage primaryStage;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Text loginMessage;

    public void login(ActionEvent event) {
        System.out.printf("Trying to login using %s:%s\n", username.getText(), password.getText());
        loginMessage.setVisible(false);
        try {
            String loggedInUser = login(username.getText(), password.getText());
            goToStudentsScreen();
        } catch (Exception e) {
            loginMessage.setText(e.getMessage());
            loginMessage.setStroke(Color.RED);
            loginMessage.setVisible(true);
        }
    }

    private void goToStudentsScreen() {
        FXMLLoader studentsLoader = new FXMLLoader(DemoFXApplication.class.getResource("students.fxml"));
        try {
            Scene scene = new Scene(studentsLoader.load());
            primaryStage.setTitle("Students - FX");
            primaryStage.setScene(scene);
        } catch (IOException e) {
            loginMessage.setText(e.getMessage());
            loginMessage.setStroke(Color.RED);
            loginMessage.setVisible(true);
        }
    }

    private String login(
            String user,
            String pass
    ) throws Exception {
        if (user.equals("john") || user.equals("jack")) {
            return user;
        } else {
            throw new Exception("Invalid username / password");
        }
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }
}