package oop;

public class Liitmine extends Tehe {
    public Liitmine(int raskusaste) {
        super(raskusaste);
    }

    public String[] lihtne() {
        int arv1 = (int) Math.round(Math.random() * 24 + 1);
        int arv2 = (int) Math.round(Math.random() * 24 + 1);
        return sõnena(arv1, arv2, '+');

    }

    public String[] keskmine() {
        int arv1 = (int) Math.round(Math.random() * 50 + 25);
        int arv2 = (int) Math.round(Math.random() * 50 + 25);
        return sõnena(arv1, arv2, '+');
    }

    public String[] raske() {
        int arv1 = (int) Math.round(Math.random() * 50 + 75);
        int arv2 = (int) Math.round(Math.random() * 50 + 75);
        return sõnena(arv1, arv2, '+');

    }
}