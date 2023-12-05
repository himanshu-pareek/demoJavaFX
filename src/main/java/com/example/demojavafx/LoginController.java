package com.example.demojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class LoginController {

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
            loginMessage.setText("Login Successful");
            loginMessage.setStroke(Color.GREEN);
        } catch (Exception e) {
            loginMessage.setText(e.getMessage());
            loginMessage.setStroke(Color.RED);
        }
        loginMessage.setVisible(true);
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
}