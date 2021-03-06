package oop;
import java.util.Arrays;
import java.util.List;

public class Jagamine extends Tehe {

    public Jagamine(int raskusaste) {
        super(raskusaste);
    }

    public int suvaline(boolean on_esimene) {
        List<Integer> valik;
        if (on_esimene) {
            if (this.raskusaste == 1) {
                valik = Arrays.asList(1, 2, 3, 4, 5);
            } else if (this.raskusaste == 2) {
                valik = Arrays.asList(5, 6, 7, 8, 9, 10);
            } else {
                valik = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15);
            }
        } else {
            if (this.raskusaste == 1) {
                valik = Arrays.asList(0, 1, 2, 3, 4, 5);
            } else if (this.raskusaste == 2) {
                valik = Arrays.asList(5, 6, 7, 8, 9, 10);
            } else {
                valik = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15);
            }
        }
        return valik.get((int) (Math.random() * valik.size()));
    }

    public String[] lihtne() {
        int arv1 = suvaline(true);
        int arv2 = suvaline(false);
        int arv = arv1 * arv2;
        return esita(arv, arv1, '/');
    }

    public String[] keskmine() {
        int arv1 = suvaline(true);
        int arv2 = suvaline(false);
        int arv = arv1 * arv2;
        return esita(arv, arv1, '/');
    }

    public String[] raske() {
        int arv1 = suvaline(true);
        int arv2 = suvaline(false);
        int arv = arv1 * arv2;
        return esita(arv, arv1, '/');
    }
}