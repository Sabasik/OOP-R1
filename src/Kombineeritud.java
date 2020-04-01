import java.util.Scanner;

public class Kombineeritud extends Tehe {
    Liitmine liitmine2 = new Liitmine(1,2);
    Lahutamine lahutamine2 = new Lahutamine(1,2);
    Korrutamine korrutamine2 = new Korrutamine(1,2);
    Jagamine jagamine2 = new Jagamine(1,2);
    Jagamine jagamine3 = new Jagamine(1,3);

    public Kombineeritud(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }


    @Override
    public void lihtne() {
    }

    @Override
    public void keskmine() {

    }

    @Override
    public void raske() {

    }
}
