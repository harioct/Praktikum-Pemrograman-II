package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hari Octavian Delrossi");
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);

        tabel.getItems().add(new Mahasiswa(1, "Hari Octavian Delrossi", "2210817210033"));
        tabel.getItems().add(new Mahasiswa(2, "Hari", "2210817210034"));
        tabel.getItems().add(new Mahasiswa(3, "Octavian", "2210817210035"));
        tabel.getItems().add(new Mahasiswa(4, "Delrossi", "2210817210036"));
        tabel.getItems().add(new Mahasiswa(5, "Hafi", "2210817210037"));
        tabel.getItems().add(new Mahasiswa(6, "Niken Kayla Salsabilla", "2210817210038"));
        tabel.getItems().add(new Mahasiswa(7, "Niken", "2210817210039"));
        tabel.getItems().add(new Mahasiswa(8, "Kayla", "2210817210040"));
        tabel.getItems().add(new Mahasiswa(9, "Salsabilla", "2210817210041"));
        tabel.getItems().add(new Mahasiswa(10, "Kay", "2210817210042"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}