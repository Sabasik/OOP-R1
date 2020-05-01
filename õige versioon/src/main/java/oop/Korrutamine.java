package oop;
public class Korrutamine extends Tehe{
    public Korrutamine(int raskusaste) {
        super(raskusaste);
    }

    public String[] lihtne() {
        int arv1 = (int) Math.round(Math.random() * 5);
        int arv2 = (int) Math.round(Math.random() * 5);
        return esita(arv1, arv2,'*');
    }

    public String[] keskmine() {
        int arv1 = (int) Math.round(Math.random() * 5 + 5);
        int arv2 = (int) Math.round(Math.random() * 5 + 5);
        return esita(arv1, arv2,'*');
    }

    public String[] raske() {
        int arv1 = (int) Math.round(Math.random() * 5 + 10);
        int arv2 = (int) Math.round(Math.random() * 5 + 10);
        return esita(arv1, arv2,'*');
    }
}
