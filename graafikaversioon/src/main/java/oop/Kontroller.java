package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class Kontroller {
    @FXML
    private Pane liitmine;

    private int tehteTüüp;

    @FXML
    private StackPane liitminenupp;
    @FXML
    private StackPane lahutamine;
    @FXML
    private StackPane korrutamine;
    @FXML
    private StackPane jagamine;
    @FXML
    private StackPane kombineeritud;

    File fail = new File("oigedvastused.txt");

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
        if (fail.delete()) {
            System.out.println("kustutatud vastustefail");
            ;
        }
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }

    @FXML
    public void enter(MouseEvent avt){
        Pane p = (Pane) avt.getSource();
        p.setOpacity(0.0);
    }
    @FXML
    public void exit(MouseEvent avt){
        Pane p = (Pane) avt.getSource();
        p.setOpacity(0.8);
    }
}
