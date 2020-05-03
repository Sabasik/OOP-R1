package oop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Kalkulaator {

    @FXML
    private Pane rejectMark;

    @FXML
    private Pane acceptMark;

    @FXML
    private TextField tekstivali;

    @FXML
    private Text avaldis;

    private Tehe tehe;

    private int vastus;
    private int kokku = 0;
    private int oigesti = 0;

    public void setTehe(Tehe tehe) {
        this.tehe = tehe;
    }

    File fail = new File("oigedvastused.txt");

    @FXML
    public void lopetaVajuta(javafx.scene.input.MouseEvent avt) {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }

    @FXML
    public void vajutaNuppu(MouseEvent avt) {
        Button getTekst = (Button) avt.getSource();
        String t = tekstivali.getText();
        tekstivali.setText(t + getTekst.getText());
    }

    @FXML
    public void arvutusTehe(MouseEvent keyEvent) {
        rejectMark.setVisible(false);
        acceptMark.setVisible(false);
        System.out.println(tehe);
        String[] info = tehe.jooksuta();
        avaldis.setText(info[0]);
        avaldis.setVisible(true);
        vastus = Integer.parseInt(info[1]);
        tekstivali.setText("");
    }

    public void OKvajuta(MouseEvent avt) throws IOException {

        rejectMark.setVisible(false);
        acceptMark.setVisible(false);
        String t = tekstivali.getText();
        try {
            if (Integer.parseInt(t) == vastus) {
                acceptMark.setVisible(true);
                failiKirjutaja("1,");
            } else {
                rejectMark.setVisible(true);
                failiKirjutaja("0,");
            }
        } catch (NumberFormatException exc) {
            tekstivali.setText("Sisesta arvuline vastus!");
        }
    }

    @FXML
    public void edasiVajuta(MouseEvent avt) throws IOException {
        loeFailist();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vastatud.fxml"));
        Parent juur = fxmlLoader.load();
        fxmlLoader.setLocation(getClass().getResource("vastatud.fxml"));
        Vastatud vastatud = fxmlLoader.getController();
        vastatud.setTekst(oigesti, kokku);

        Stage lava = new Stage();
        lava.initOwner(tekstivali.getScene().getWindow());
        lava.setScene(new Scene(juur));
        lava.showAndWait();
    }

    public void loeFailist() {
        try {
            String andmed = Files.readString(fail.toPath(), StandardCharsets.UTF_8);
            String[] osad = andmed.split(",");
            kokku = osad.length;

            for (String s : osad) {
                if (s.equals("1")) {
                    oigesti++;
                }
            }
        } catch (IOException e) {
            System.out.println("faili ei leitud lugemiseks");
        }
    }

    public void failiKirjutaja(String bool) throws IOException {
        try (OutputStreamWriter vastusteKirjutaja = new OutputStreamWriter(new FileOutputStream("oigedvastused.txt", true))) {
            vastusteKirjutaja.write(bool);
        }
    }
}
