package oop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Kalkulaator {

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
        System.out.println(tehe);
        String[] info = tehe.jooksuta();
        avaldis.setText(info[0]);
        avaldis.setVisible(true);
        vastus = Integer.parseInt(info[1]);
    }

    public void OKvajuta(MouseEvent avt){
        //faililugemine kõik tehted
        //vastuse kontrollimine
    }
}
