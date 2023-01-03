module com.example.focaap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;
    requires org.junit.platform.engine;
    requires org.junit.platform.launcher;
    requires org.junit.platform.suite;
    requires org.junit.platform.suite.api;
    requires org.junit.platform.suite.commons;
    requires org.junit.platform.suite.engine;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.focaap to javafx.fxml;
    exports com.example.focaap;
    exports com.example.focaap.controller;
    opens com.example.focaap.controller to javafx.fxml;
}