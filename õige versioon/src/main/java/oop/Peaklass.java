package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Peaklass extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {
        Button lopp = new Button("Lõpeta");
        Button vaataVastuseid = new Button("statistika");
        int kokkuvastatud = 0;

        lopp.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lopp.setLayoutX(700);
        lopp.setLayoutY(25);
        vaataVastuseid.setVisible(false);
        vaataVastuseid.setLayoutX(670);
        vaataVastuseid.setLayoutY(100);
        vaataVastuseid.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        Group juur1 = new Group();
        File fail = new File("oigedvastused.txt");


        // stati stseen

        Group tehted = new Group();
        Scene statisika = new Scene(tehted, 800, 400, Color.LIGHTCORAL);
        Button lopp4 = new Button("Lõpeta");
        lopp4.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lopp4.setLayoutX(700);
        lopp4.setLayoutY(25);

        Text tekst = new Text();
        tehted.getChildren().addAll(tekst,lopp4);
        tekst.setLayoutX(400);
        tekst.setLayoutY(200);
        tekst.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
        vaataVastuseid.setOnMouseClicked(e -> {


            try {
                String andmed = Files.readString(fail.toPath(), StandardCharsets.UTF_8);
                String[] osad = andmed.split(",");
                StringBuilder stat = new StringBuilder();


                for (String s : osad) {
                    stat.append(s);
                    stat.append("\n");
                }

                stat.append("Õigesti vastatud: " + osad.length + "/" + kokkuvastatud);  //kokkuvastatud peab lugema kokku!!
                tekst.setText(stat.toString());
                peaLava.setScene(statisika);
                peaLava.show();
            } catch (IOException l) {
                System.out.println("faili pole");
            }

        });

        //avastseen

        Text tervitus = new Text("Tere tulemast arvutama!");
        tervitus.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
        tervitus.setLayoutX(225);
        tervitus.setLayoutY(100);
        tervitus.setFill(Color.INDIGO);
        juur1.getChildren().addAll(tervitus, lopp, vaataVastuseid);
        Button liitmine = new Button("    Liitmine   ");
        Button lahutamine = new Button("Lahutamine");
        Button korrutamine = new Button("Korrutamine");
        Button jagamine = new Button("  Jagamine  ");
        Button kombineeritud = new Button("Kombineeritud tehted");
        liitmine.setLayoutX(75);
        liitmine.setLayoutY(150);
        liitmine.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        korrutamine.setLayoutX(75);
        korrutamine.setLayoutY(250);
        korrutamine.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lahutamine.setLayoutX(550);
        lahutamine.setLayoutY(150);
        lahutamine.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        jagamine.setLayoutX(550);
        jagamine.setLayoutY(250);
        jagamine.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        kombineeritud.setLayoutX(275);
        kombineeritud.setLayoutY(200);
        kombineeritud.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        juur1.getChildren().addAll(liitmine, lahutamine, korrutamine, jagamine, kombineeritud);
        Scene avastseen = new Scene(juur1, 800, 400, Color.LIGHTCORAL);
        peaLava.setTitle("Arvutamine");
        peaLava.setScene(avastseen);
        peaLava.show();


        // raskusastme stseen


        Button lopp2 = new Button("Lõpeta");
        lopp2.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lopp2.setLayoutX(700);
        lopp2.setLayoutY(25);
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
        lihtne.setLayoutX(125);
        lihtne.setLayoutY(200);
        lihtne.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        keskmine.setLayoutX(350);
        keskmine.setLayoutY(200);
        keskmine.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        raske.setLayoutX(575);
        raske.setLayoutY(200);
        raske.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        raskusaste.getChildren().addAll(lihtne, keskmine, raske, lopp2);
        Scene raskus = new Scene(raskusaste, 800, 400, Color.LIGHTCORAL);

        Button lopp3 = new Button("Lõpeta");
        lopp3.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lopp3.setLayoutX(700);
        lopp3.setLayoutY(25);
        Group lahenda = new Group();
        TextField sisesta = new TextField();
        sisesta.setText("");
        sisesta.setLayoutX(300);
        sisesta.setLayoutY(200);
        sisesta.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        Button vasta = new Button("Vasta");
        vasta.setLayoutX(300);
        vasta.setLayoutY(250);
        vasta.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        Label l = new Label("");
        l.setLayoutX(300);
        l.setLayoutY(300);
        l.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        lahenda.getChildren().addAll(lopp3, sisesta, vasta, l);
        Scene lahendamine = new Scene(lahenda, 800, 400, Color.LIGHTCORAL);


        // õigesti vastanud korral tulev stseen


        Group oige = new Group();
        Button edasi = new Button("Edasi");
        edasi.setLayoutX(350);
        edasi.setLayoutY(350);
        edasi.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
        oige.getChildren().add(edasi);
        Image image = new Image(new FileInputStream("tubli.gif"));
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(25);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);
        oige.getChildren().add(imageView);
        Scene vastatud = new Scene(oige, 800, 400, Color.LIGHTCORAL);


        //reaktsioonid

        edasi.setOnAction(e -> {
            vaataVastuseid.setVisible(true);
            peaLava.setScene(avastseen);
            peaLava.show();
        });
        lopp.setOnAction(e -> {
            if (fail.delete()) {
                System.out.println("kustutatud vastustefail");
                ;
            }
            peaLava.close();
            System.exit(0);
        });
        lopp2.setOnAction(e -> {
            if (fail.delete()) {
                System.out.println("kustutatud vastustefail");
                ;
            }
            peaLava.close();
            System.exit(0);
        });
        lopp3.setOnAction(e -> {
            if (fail.delete()) {
                System.out.println("kustutatud vastustefail");
                ;
            }
            peaLava.close();
            System.exit(0);
        });
        lopp4.setOnAction(e -> {
            if (fail.delete()) {
                System.out.println("kustutatud vastustefail");
                ;
            }
            peaLava.close();
            System.exit(0);
        });


        korrutamine.setOnAction(e -> {
            l.setText("");
            peaLava.setScene(raskus);
            peaLava.show();

            lihtne.setOnAction(ev -> {

                Tehe ko = new Korrutamine(1);
                String[] info = ko.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException exc) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            keskmine.setOnAction(ev -> {
                l.setText("");
                Tehe ko = new Korrutamine(2);
                String[] info = ko.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            raske.setOnAction(ev -> {
                l.setText("");
                Tehe ko = new Korrutamine(3);
                String[] info = ko.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
        });
        liitmine.setOnAction(e -> {
            l.setText("");
            peaLava.setScene(raskus);
            peaLava.show();
            lihtne.setOnAction(ev -> {
                Tehe li = new Liitmine(1);
                String[] info = li.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            keskmine.setOnAction(ev -> {
                l.setText("");
                Tehe li = new Liitmine(2);
                String[] info = li.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            raske.setOnAction(ev -> {
                l.setText("");
                Tehe li = new Liitmine(3);
                String[] info = li.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
        });
        jagamine.setOnAction(e -> {
            l.setText("");
            peaLava.setScene(raskus);
            peaLava.show();
            lihtne.setOnAction(ev -> {
                Tehe ja = new Jagamine(1);
                String[] info = ja.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            keskmine.setOnAction(ev -> {
                l.setText("");
                Tehe ja = new Jagamine(2);
                String[] info = ja.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            raske.setOnAction(ev -> {
                l.setText("");
                Tehe ja = new Jagamine(3);
                String[] info = ja.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
        });
        lahutamine.setOnAction(e -> {
            l.setText("");
            peaLava.setScene(raskus);
            peaLava.show();
            lihtne.setOnAction(ev -> {
                Tehe la = new Lahutamine(1);
                String[] info = la.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            keskmine.setOnAction(ev -> {
                l.setText("");
                Tehe la = new Lahutamine(2);
                String[] info = la.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            raske.setOnAction(ev -> {
                l.setText("");
                Tehe la = new Lahutamine(3);
                String[] info = la.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
        });
        kombineeritud.setOnAction(e -> {
            peaLava.setScene(raskus);
            peaLava.show();
            lihtne.setOnAction(ev -> {
                l.setText("");
                Tehe komb = new Kombineeritud(1);
                String[] info = komb.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            keskmine.setOnAction(ev -> {
                l.setText("");
                Tehe komb = new Kombineeritud(2);
                String[] info = komb.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
            raske.setOnAction(ev -> {
                l.setText("");
                Tehe komb = new Kombineeritud(3);
                String[] info = komb.jooksuta();
                Text avaldis = new Text(info[0]);
                avaldis.setLayoutX(150);
                avaldis.setLayoutY(225);
                avaldis.setStyle("-fx-base: red; -fx-text-fill: indigo; -fx-font-size: 20;");
                int vastus = Integer.parseInt(info[1]);
                lahenda.getChildren().add(avaldis);
                peaLava.setScene(lahendamine);
                peaLava.show();
                vasta.setOnAction(action -> {
                    String sisend = sisesta.getText();
                    try {
                        if (Integer.valueOf(sisend) == vastus) {
                            failiKirjutaja(avaldis.getText(), String.valueOf(vastus));
                            sisesta.setText("");
                            lahenda.getChildren().remove(avaldis);
                            peaLava.setScene(vastatud);
                            peaLava.show();
                        } else {
                            l.setText("Vale vastus, proovi uuesti!");
                        }
                    } catch (NumberFormatException exc) {
                        l.setText("Sisesta arvuline vastus!");
                    } catch (IOException ex) {
                        System.out.println("faili ei leitud");
                    }
                });
            });
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void failiKirjutaja(String avaldis, String vastus) throws IOException {
        try (OutputStreamWriter vastusteKirjutaja = new OutputStreamWriter(new FileOutputStream("oigedvastused.txt", true))) {
            vastusteKirjutaja.write(avaldis + " " + vastus + ",");
        }
    }
}
