package oop;

public class Kombineeritud extends Tehe {
    public Kombineeritud(int raskusaste) {
        super(raskusaste);
    }


    /* Esimene esita meetod, mis esitab lihtsa ja keskmise raskusastmega tehet, kus on vaja kolme erinevat arvu*/

    public String[] esitaKombineeritud1(int arv1, int arv2, int arv3, char esimeneMark, char teineMark) {
        int avaldis;
        if (esimeneMark == '+' && teineMark == '-') {
            avaldis = arv1 + arv2 - arv3;
        } else {
            avaldis = arv1 * arv2 / arv3;
        }
        String tehe = arv1 + String.valueOf(esimeneMark) + arv2 + teineMark + arv3 + " = ";
        return new String[] {tehe, avaldis + ""};
    }

    /* Teine esita meetod, mis esitab raske raskusastmega tehet, kus on vaja nelja erinevat arvu*/

    public String[] esitaKombineeritud2(int arv1, int arv2, int arv3, int arv4, char mark) {
        int avaldis;
        if (mark == '+') {
            avaldis = ((arv1 + arv2) * arv3) / arv4;
        } else {
            avaldis = ((arv1 - arv2) * arv3) / arv4;
        }
        String tehe = "(" + "(" + arv1 + mark + arv2 + ")" + " * " + arv3 + ")" + "/" + arv4 + " = ";
        return new String[] {tehe, avaldis + ""};
    }


    @Override
    public String[] lihtne() {
        int arv1 = (int) Math.round(Math.random() * 24 + 1);
        int arv2 = (int) Math.round(Math.random() * 24 + 1);
        int arv3 = (int) Math.round(Math.random() * (arv1 + arv2));
        return esitaKombineeritud1(arv1, arv2, arv3, '+', '-');
    }

    @Override
    public String[] keskmine() {
        int arv3 = (int) Math.round(Math.random() * 5 + 1);
        int arv1 = arv3 * (int) Math.round(Math.random() * 5 + 2);
        int arv2 = (int) Math.round(Math.random() * 3 + 2);
        return esitaKombineeritud1(arv1, arv2, arv3, '*', '/');
    }

    @Override
    public String[] raske() {
        int arv4 = (int) Math.round(Math.random() * 7 + 1);
        int arvAbi = arv4 * (int) Math.round(Math.random() * 23 + 2);
        int arv1 = arvAbi - (int) Math.round(Math.random() * (arvAbi - 2) + 1);
        int arv2 = arvAbi - arv1;
        int arv3 = (int) Math.round(Math.random() * 4 + 1);
        return esitaKombineeritud2(arv1, arv2, arv3, arv4, '+');

    }
}
