package com.example.courseproject.controller;

import com.example.courseproject.HelloApplication;
import com.example.courseproject.model.User;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainAdminController {

        @FXML
        private MenuItem aggregateQuery;

        @FXML
        private MenuItem conditionalQuery;

        @FXML
        private MenuItem crossQuery;

        @FXML
        private MenuItem multiTableQuery;


        @FXML
        private MenuItem gruppa0091Query;


        @FXML
        private MenuItem quantifierQuery;


        @FXML
        private MenuItem septemberQuery;

        @FXML
        private MenuItem scalarSubquery;

        @FXML
        private JFXButton showTableViewGruppa;

        @FXML
        private JFXButton showTableViewPoseshaemost;

        @FXML
        private JFXButton showTableViewPredmet;

        @FXML
        private JFXButton showTableViewProfile;

        @FXML
        private JFXButton showTableViewStudents;

        @FXML
        private JFXButton showTableViewUsers;

        @FXML
        private MenuItem tableQuery;

        @FXML
        private MenuItem unionQuery;

        User user = new User();
        LoginController loginController = new LoginController();

    @FXML
    void initialize() {
        showTableViewStudents.setOnAction(actionEvent -> {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewStudents.fxml"));
                try {
                    fxmlLoader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Stage stage = new Stage();
                Parent root = fxmlLoader.getRoot();
                stage.setScene(new Scene(root));
                stage.setTitle("?????????????? ????????????????");
                stage.showAndWait();
        });


        showTableViewProfile.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewProfile.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ??????????????");
            stage.showAndWait();
        });
        showTableViewGruppa.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewGruppa.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ????????????");
            stage.showAndWait();
        });
        showTableViewPredmet.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewPredmet.fxml"));
            try {
                fxmlLoader.load();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ????????????????");
            stage.showAndWait();
        });
        showTableViewPoseshaemost.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewPoseshaemost.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ????????????????????????");
            stage.showAndWait();
        });
        showTableViewUsers.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableViews/admin/tableViewUsers.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ????????????????????????");
            stage.showAndWait();
        });
        conditionalQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/simpleQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ???????????? ?? ????????????????");
            stage.showAndWait();
        });
        scalarSubquery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/scalarQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????????? ??????????????????");
            stage.showAndWait();
        });
        tableQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/tableQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????????? ????????????");
            stage.showAndWait();
        });
        quantifierQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/quantifierQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("????????????????");
            stage.showAndWait();
        });
        unionQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/unionQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("??????????????????????");
            stage.showAndWait();
        });
        multiTableQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/multiTableQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("???????????????????????????? ????????????");
            stage.showAndWait();
        });
        septemberQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/septemberQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("???????????????? ?? 1 ???????????????? 2022 ????????");
            stage.showAndWait();
        });
        crossQuery.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/crossQuery.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("???????????????????????? ????????????");
            stage.showAndWait();
        });
        gruppa0091Query.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Queries/gruppa0091Query.fxml"));
            try {
                fxmlLoader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Parent root = fxmlLoader.getRoot();
            stage.setScene(new Scene(root));
            stage.setTitle("?????????????? ???? ???????????? 0091");
            stage.showAndWait();
        });
    }
}