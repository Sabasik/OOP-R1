package oop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Peaklass extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {
        BorderPane bp = new BorderPane();
        bp.setBackground(new Background(new BackgroundFill(Color.LIGHTCORAL, CornerRadii.EMPTY, Insets.EMPTY)));
        Group juur1 = new Group();
        Text tervitus = new Text("\n" + " ".repeat(40) + "Tere tulemast arvutama!");
        tervitus.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        tervitus.setFill(Color.INDIGO);
        juur1.getChildren().add(tervitus);
        Button liitmine = new Button("  Liitmine  ");
        Button lahutamine = new Button("Lahutamine");
        Button korrutamine = new Button("Korrutamine");
        Button jagamine = new Button("  Jagamine  ");
        Button kombineeritud = new Button("Kombineeritud tehted");
        bp.setTop(tervitus);
        bp.setCenter(juur1);
        liitmine.setLayoutX(25);
        liitmine.setLayoutY(50);
        korrutamine.setLayoutX(25);
        korrutamine.setLayoutY(150);
        lahutamine.setLayoutX(500);
        lahutamine.setLayoutY(50);
        jagamine.setLayoutX(500);
        jagamine.setLayoutY(150);
        kombineeritud.setLayoutX(250);
        kombineeritud.setLayoutY(100);
        juur1.getChildren().addAll(liitmine, lahutamine, korrutamine, jagamine, kombineeritud);
        Scene avastseen = new Scene(bp, 800, 400, Color.LIGHTCORAL);
        peaLava.setTitle("Arvutamine");
        peaLava.setScene(avastseen);
        peaLava.show();


        Group raskusaste = new Group();
        Text valik = new Text("Vali raskusaste:");
        valik.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        valik.setFill(Color.INDIGO);
        raskusaste.getChildren().add(valik);
        valik.setLayoutX(150);
        valik.setLayoutY(100);
        Button lihtne = new Button(" lihtne ");
        Button keskmine = new Button("keskmine");
        Button raske = new Button(" raske ");
        lihtne.setLayoutX(150);
        lihtne.setLayoutY(200);
        keskmine.setLayoutX(350);
        keskmine.setLayoutY(200);
        raske.setLayoutX(550);
        raske.setLayoutY(200);
        raskusaste.getChildren().addAll(lihtne, keskmine, raske);
        Scene raskus = new Scene(raskusaste, 800, 400, Color.LIGHTCORAL);


        lihtne.setOnAction(e ->{

        });
        keskmine.setOnAction(e ->{

        });
        raske.setOnAction(e ->{

        });

        korrutamine.setOnAction(e ->{
            peaLava.setScene(raskus);
            peaLava.show();
        });
        liitmine.setOnAction(e ->{
            peaLava.setScene(raskus);
            peaLava.show();
        });
        jagamine.setOnAction(e ->{
            peaLava.setScene(raskus);
            peaLava.show();
        });
        lahutamine.setOnAction(e ->{
            peaLava.setScene(raskus);
            peaLava.show();
        });
        kombineeritud.setOnAction(e ->{
            peaLava.setScene(raskus);
            peaLava.show();
        });


    }

    public static void main(String[] args) {
        launch(args);
    }

    public static int mituTehet() {
        int mitu;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Mitu tehet soovid teha?");
            try {
                mitu = Integer.parseInt(s.nextLine());
                if (mitu < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Palun sisesta positiivne täisarv!");
            }
        }
        return mitu;
    }

}
