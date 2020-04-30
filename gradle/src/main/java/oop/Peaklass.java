package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
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
        Group juur1 = new Group();
        Text tervitus = new Text("\n" + " ".repeat(40) + "Tere tulemast arvutama!");
        tervitus.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        tervitus.setFill(Color.FORESTGREEN);
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

        korrutamine.setOnAction(e ->{

        });
        liitmine.setOnAction(e ->{

        });
        jagamine.setOnAction(e ->{

        });
        lahutamine.setOnAction(e ->{

        });
        kombineeritud.setOnAction(e ->{

        });

        Scene avastseen = new Scene(bp, 800, 400, Color.LIGHTCORAL);
        peaLava.setTitle("Arvutamine");
        peaLava.setScene(avastseen);
        peaLava.show();
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

    public static int raskusaste() {
        int r;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Vali raskusaste:\nlihtne - sisesta 1\n"
                    + "keskmine - sisesta 2\nraske - sisesta 3");
            try {
                r = Integer.parseInt(s.nextLine());
                if (r < 1 || r > 3) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Palun sisesta arv 1, 2 või 3!");
            }
        }
        return r;
    }
}
