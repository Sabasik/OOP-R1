package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class Kontroller {
    @FXML
    private Pane liitmine;

    private int tehteTüüp;


    @FXML
    public void liitmineVajuta(MouseEvent avt) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("raskus.fxml"));
        Parent juur = fxmlLoader.load();
        Raskus raskusAstmeKontroller = fxmlLoader.getController();
        raskusAstmeKontroller.setTüüp(1);

        Stage lava = new Stage();
        lava.initOwner(liitmine.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();

    }
    @FXML
    public void lahutamineVajuta(MouseEvent avt) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("raskus.fxml"));
        Parent juur = fxmlLoader.load();
        Raskus raskusAstmeKontroller = fxmlLoader.getController();
        raskusAstmeKontroller.setTüüp(2);

        Stage lava = new Stage();
        lava.initOwner(liitmine.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();
    }
    @FXML
    public void korrutamineVajuta(MouseEvent avt) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("raskus.fxml"));
        Parent juur = fxmlLoader.load();
        Raskus raskusAstmeKontroller = fxmlLoader.getController();
        raskusAstmeKontroller.setTüüp(3);

        Stage lava = new Stage();
        lava.initOwner(liitmine.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();
    }
    @FXML
    public void jagamineVajuta(MouseEvent avt) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("raskus.fxml"));
        Parent juur = fxmlLoader.load();
        Raskus raskusAstmeKontroller = fxmlLoader.getController();
        raskusAstmeKontroller.setTüüp(4);

        Stage lava = new Stage();
        lava.initOwner(liitmine.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();
    }
    @FXML
    public void kombineeritudVajuta(MouseEvent avt) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("raskus.fxml"));
        Parent juur = fxmlLoader.load();
        Raskus raskusAstmeKontroller = fxmlLoader.getController();
        raskusAstmeKontroller.setTüüp(5);

        Stage lava = new Stage();
        lava.initOwner(liitmine.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();
    }


    @FXML
    public void lopetaVajuta(MouseEvent avt) {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }


}
