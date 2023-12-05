module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.example.demojavafx to javafx.fxml;
    exports com.example.demojavafx;
}