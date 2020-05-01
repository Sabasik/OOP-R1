package oop;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Kalkulaator {
    private boolean vastuseÕigsus;
    private double õigeVastus;

    public Scene kalkulaator(int raskusaste, int tehteTüüp) {
        BorderPane juur = new BorderPane();
        String rehkendus;
        double väärtus;

        if (tehteTüüp == 1) {
            Liitmine liitmine = new Liitmine(raskusaste);
            String[] andmed = liitmine.raskusaste();
            rehkendus = andmed[0];
            väärtus = Double.parseDouble(andmed[1]);
        } else if (tehteTüüp == 2) {
            Lahutamine lahutamine = new Lahutamine(raskusaste);
            String[] andmed = lahutamine.raskusaste();
            rehkendus = andmed[0];
            väärtus = Double.parseDouble(andmed[1]);
        } else if (tehteTüüp == 3) {
            Korrutamine korrutamine = new Korrutamine(raskusaste);
            String[] andmed = korrutamine.raskusaste();
            rehkendus = andmed[0];
            väärtus = Double.parseDouble(andmed[1]);
        } else if (tehteTüüp == 4) {
            Jagamine jagamine = new Jagamine(raskusaste);
            String[] andmed = jagamine.raskusaste();
            rehkendus = andmed[0];
            väärtus = Double.parseDouble(andmed[1]);
        } else {
            Kombineeritud kombineeritud = new Kombineeritud(raskusaste);
            String[] andmed = kombineeritud.raskusaste();
            rehkendus = andmed[0];
            väärtus = Double.parseDouble(andmed[1]);
        }
        HBox ülemineOsa = new HBox();
        Text arvutus = new Text(rehkendus);
        TextField tekstiala = new TextField();

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        Button üks = new Button("1");
        Button kaks = new Button("2");
        Button kolm = new Button("3");
        Button neli = new Button("4");
        Button viis = new Button("5");
        Button kuus = new Button("6");
        Button seitse = new Button("7");
        Button kaheksa = new Button("8");
        Button üheksa = new Button("9");
        Button nul = new Button("0");
        Button okNupp = new Button("OK");
        Button valju = new Button("välju");

        grid.add(üks, 0, 0);
        grid.add(kaks, 1, 0);
        grid.add(kolm, 2, 0);
        grid.add(neli, 0, 1);
        grid.add(viis, 1, 1);
        grid.add(kuus, 2, 1);
        grid.add(seitse, 0, 2);
        grid.add(kaheksa, 1, 2);
        grid.add(üheksa, 2, 2);
        grid.add(nul, 3, 1);
        grid.add(okNupp, 3, 2);

        okNupp.setOnMouseClicked(e -> {
            Double vastus = Double.parseDouble(tekstiala.getCharacters().toString());
            System.out.println(vastus);
            System.out.println(väärtus);
            if (vastus == väärtus) {
                vastuseÕigsus = true;
            } else {
                vastuseÕigsus = false;
            }
            System.out.println(vastuseÕigsus);
        });

        juur.setBottom(valju);
        valju.setOnMouseClicked(e -> Platform.exit());

        ülemineOsa.getChildren().addAll(tekstiala, arvutus);
        juur.setTop(ülemineOsa);
        juur.setCenter(grid);
        Scene kalkulaator = new Scene(juur, 600, 600);

        õigeVastus = väärtus;
        return kalkulaator;
    }

    public boolean isVastuseÕigsus() {
        return vastuseÕigsus;
    }

    public double getÕigeVastus() {
        return õigeVastus;
    }
}
