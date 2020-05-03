package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class Vastatud {
    @FXML
    private Text oigesti;

    @FXML
    private Text valesti;

    private int oigedArv;
    private int kokkuArv;
    File fail = new File("oigedvastused.txt");

    @FXML
    public void algusesseVajuta(MouseEvent avt) throws IOException {
        if (fail.delete()) {
            System.out.println("kustutatud vastustefail");
            ;
        }
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        Stage lava = (Stage) p.getOwner();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("avastseen.fxml"));
        Parent juur = fxmlLoader.load();
        Scene avastseen = new Scene(juur);
        fxmlLoader.setLocation(getClass().getResource("avastseen.fxml"));
        lava.setScene(avastseen);
        p.hide();
    }

    public void setTekst(int oigedArv, int kokkuArv){
        String oigeTekst = oigedArv + "/" + kokkuArv;
        oigesti.setText(oigeTekst);

        String valestiTekst = kokkuArv-oigedArv + "/" + kokkuArv;
        valesti.setText(valestiTekst);
    }
}
