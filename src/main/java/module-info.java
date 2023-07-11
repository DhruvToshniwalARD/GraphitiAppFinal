module com.graphiti.graphitiapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires com.fazecast.jSerialComm;
    requires java.desktop;
    requires freetts;

    opens com.graphiti.graphitiapp to javafx.fxml;
    exports com.graphiti.graphitiapp;
}