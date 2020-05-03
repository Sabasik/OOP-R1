package oop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

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

    public void setTehe(Tehe tehe) {
        this.tehe = tehe;
    }

    @FXML
    public void lopetaVajuta(javafx.scene.input.MouseEvent avt) {
        Button nupp = (Button) avt.getSource();
        Stage p = (Stage) nupp.getScene().getWindow();
        p.close();
        System.exit(0);
    }

    @FXML
    public void vajutaNuppu(MouseEvent avt){
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
        //faililugemine kõik tehted
        //vastuse kontrollimine
        rejectMark.setVisible(false);
        acceptMark.setVisible(false);
        String t = tekstivali.getText();
        try {
            if (Integer.valueOf(t) == vastus) {
                acceptMark.setVisible(true);
            } else {
                rejectMark.setVisible(true);
            }
        } catch (NumberFormatException exc) {
            tekstivali.setText("Sisesta arvuline vastus!");
        }
    }
}
