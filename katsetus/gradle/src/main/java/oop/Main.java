package oop;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
        Text alustusTekst = new Text("Tere tulemast arvutama! Vali, millist raskusastet soovid teha\n jm tutvustav tekst");
        alustusTekst.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));


        Button liitmine = new Button("  Liitmine  ");
        Button lahutamine = new Button("Lahutamine");
        Button korrutamine = new Button("Korrutamine");
        Button jagamine = new Button("  Jagamine  ");
        Button kombineeritud = new Button("Kombineeritud tehted");
        Button valju = new Button("Välju");
        bp.setCenter(alustusTekst);

        HBox nupud = new HBox();
        nupud.getChildren().addAll(liitmine, lahutamine, korrutamine, jagamine, kombineeritud, valju);
        bp.setBottom(nupud);

        Raskused raskused = new Raskused();
        Kalkulaator kalk = new Kalkulaator();
        AtomicInteger tehteTüüp = new AtomicInteger();

        korrutamine.setOnAction(e -> {
            tehteTüüp.set(3);
            primaryStage.setScene(raskused.raskused());
            primaryStage.show();
        });
        liitmine.setOnAction(e -> {
            tehteTüüp.set(1);
            primaryStage.setScene(raskused.raskused());
            primaryStage.show();
        });
        jagamine.setOnAction(e -> {
            tehteTüüp.set(4);
            primaryStage.setScene(raskused.raskused());
            primaryStage.show();
        });
        lahutamine.setOnAction(e -> {
            tehteTüüp.set(2);
            primaryStage.setScene(raskused.raskused());
            primaryStage.show();
        });
        kombineeritud.setOnAction(e -> {
            tehteTüüp.set(5);
            primaryStage.setScene(raskused.raskused());
            primaryStage.show();
        });
        valju.setOnMouseClicked(e -> {
            Platform.exit();
        });

        kalk.kalkulaator(raskused.getRaskuaste(), tehteTüüp.get());

        if (kalk.isVastuseÕigsus()) {
            System.out.println("Õige vastus");
        } else {
            System.out.println("Vale vastus!, Õige vastus on " + kalk.getÕigeVastus());
        }


        primaryStage.setTitle("arvutus");
        primaryStage.setScene(new Scene(bp, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}