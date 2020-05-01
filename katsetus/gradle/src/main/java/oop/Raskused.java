package oop;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Raskused {
    private int raskuaste;

    public Scene raskused() {
        Kalkulaator kalk = new Kalkulaator();
        BorderPane juur2 = new BorderPane();
        VBox nupud2 = new VBox();

        Text tekst = new Text("Vali sobiv raskusaste");
        Button lihtne = new Button("lihtne");
        Button keskmine = new Button("keskmine");
        Button raske = new Button("raske");
        nupud2.getChildren().addAll(lihtne, keskmine, raske);
        juur2.setTop(tekst);
        juur2.setCenter(nupud2);

        lihtne.setOnMouseClicked(e -> {
            raskuaste = 1;
        });
        keskmine.setOnMouseClicked(e -> {
            raskuaste = 2;
        });
        raske.setOnMouseClicked(e -> {
            raskuaste = 3;
        });

        Scene raskused = new Scene(juur2, 400, 600);
        return raskused;
    }

    public int getRaskuaste() {
        return raskuaste;
    }
}
