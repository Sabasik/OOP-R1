import java.util.Scanner;

public class Lahutamine extends Tehe {

    public Lahutamine(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }

    public void lihtne() {
        for (int i = 0; i < this.tehted; i++) {
            int arv1 = (int) Math.round(Math.random() * 50);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2, '-');
        }
    }

    public void keskmine() {
        for (int i = 0; i < this.tehted; i++) {
            int arv1 = (int) Math.round(Math.random() * 100 + 50);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2, '-');
        }
    }

    public void raske() {
        for (int i = 0; i < this.tehted; i++) {
            int arv1 = (int) Math.round(Math.random() * 100 + 150);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2, '-');
        }
    }
}
