package oop;

public class Lahutamine extends Tehe {

    public Lahutamine(int raskusaste) {
        super(raskusaste);
    }

    public String[] lihtne() {
        int arv1 = (int) Math.round(Math.random() * 50);
        int arv2 = (int) Math.round(Math.random() * arv1);
        return esita(arv1, arv2, '-');
    }

    public String[] keskmine() {
        int arv1 = (int) Math.round(Math.random() * 100 + 50);
        int arv2 = (int) Math.round(Math.random() * arv1);
        return esita(arv1, arv2, '-');
    }

    public String[] raske() {
        int arv1 = (int) Math.round(Math.random() * 100 + 150);
        int arv2 = (int) Math.round(Math.random() * arv1);
        return esita(arv1, arv2, '-');
    }
}
