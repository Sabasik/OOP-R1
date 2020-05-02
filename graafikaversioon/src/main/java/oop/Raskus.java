package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Raskus {

    private Text avaldis = new Text();
    int vastus;

    @FXML
    public void lihtneVajuta(MouseEvent avt) throws IOException {
        Tehe li = new Liitmine(1);
        String[] info = li.jooksuta();
        avaldis.setText(info[0]);
        vastus = Integer.parseInt(info[1]);

        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();

        vahetaStseeni(p);

    }

    @FXML
    public void lopetaVajuta(MouseEvent avt) {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }

    @FXML
    public void tagasi(MouseEvent avt){
        Button p = (Button) avt.getSource();
        p.getScene().getWindow().hide();
    }

    public void vahetaStseeni(Stage lava) throws IOException {
        Parent juur = FXMLLoader.load(getClass().getResource("kalkulaator.fxml"));
        Scene kalkulaator = new Scene(juur);
        lava.setScene(kalkulaator);

    }


}
