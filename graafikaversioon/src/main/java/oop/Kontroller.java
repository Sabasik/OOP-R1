package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class Kontroller {

    @FXML
    private Button liitmine;

    @FXML
    public void liitmineVajuta(MouseEvent avt) throws IOException {
        Button p = (Button) avt.getSource();
        Parent juur = FXMLLoader.load(getClass().getResource("raskus.fxml"));
        Stage lava = new Stage();
        lava.initOwner(p.getScene().getWindow());
        lava.setScene(new Scene(juur));

        lava.showAndWait();

    }
    @FXML
    public void lahutamineVajuta(MouseEvent avt) throws IOException {

    }
    @FXML
    public void korrutamineVajuta(MouseEvent avt) throws IOException {

    }
    @FXML
    public void jagamineVajuta(MouseEvent avt) throws IOException {

    }
    @FXML
    public void kombineeritudVajuta(MouseEvent avt) throws IOException {

    }


    @FXML
    public void lopetaVajuta(MouseEvent avt) {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }


}
