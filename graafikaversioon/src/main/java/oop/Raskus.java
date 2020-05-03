package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Raskus {

    private int tüüp;

    private Tehe tehe;

    public void setTüüp(int tüüp) {
        this.tüüp = tüüp;
    }

    @FXML
    public void lihtneVajuta(MouseEvent avt) throws IOException {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        Stage lava = (Stage) p.getOwner();

        if(tüüp == 1){
            tehe = new Liitmine(1);
        } else if (tüüp == 2){
            tehe = new Lahutamine(1);
        } else if (tüüp == 3){
            tehe = new Korrutamine(1);
        } else if (tüüp == 4){
            tehe = new Jagamine(1);
        } else if (tüüp == 5){
            tehe = new Kombineeritud(1);
        }

        Parent juurKalk = FXMLLoader.load(getClass().getResource("kalkulaator.fxml"));
        Scene kalkulaatoriStseen = new Scene(juurKalk);

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("kalkulaator.fxml"));
        AnchorPane k = fxmlLoader.load(getClass().getResourceAsStream("kalkulaator.fxml"));
        Kalkulaator kalkulaator = fxmlLoader.getController();
        kalkulaator.setTehe(tehe);  //see ka ei seti tehet nii nagu vaja on

        lava.setScene(kalkulaatoriStseen);
        p.hide();
    }

    @FXML
    public void keskmineVajuta(MouseEvent avt) throws IOException {

        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
    }

    @FXML
    public void raskeVajuta(MouseEvent avt) throws IOException {

        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
    }

    @FXML
    public void tagasi(MouseEvent avt){
        Button p = (Button) avt.getSource();
        p.getScene().getWindow().hide();
    }

}
