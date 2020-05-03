package oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PeaklassProov extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {
        Parent juur = FXMLLoader.load(getClass().getResource("avastseen.fxml"));
        Scene avastseen = new Scene(juur);
        System.out.println(avastseen);
        avastseen.setRoot(juur);
        peaLava.setTitle("Arvutamine");
        peaLava.setScene(avastseen);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
