import java.util.Scanner;

public class Kombineeritud extends Tehe {
    public Kombineeritud(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }


    /* Esimene esita meetod, mis esitab lihtsa ja keskmise raskusastmega tehet, kus on vaja kolme erinevat arvu*/

    public void esitaKombineeritud1(int arv1, int arv2, int arv3, char esimeneMark, char teineMark) {
        int vastus;
        int avaldis;
        if (esimeneMark == '+' && teineMark == '-') {
            avaldis = arv1 + arv2 - arv3;
        } else {
            avaldis = arv1 * arv2 / arv3;
        }
        while (true) {
            System.out.print(arv1 + String.valueOf(esimeneMark) + arv2 + teineMark + arv3 + " = ");
            Scanner s = new Scanner(System.in);
            try {
                String sisend = s.nextLine();
                if (sisend.equals("")) {
                    System.out.println("Õige vastus on: " + (avaldis));
                    break;
                } else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != avaldis) {
                        throw new Exception();
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vale vastus, proovi uuesti!");
            }
        }
    }

    /* Teine esita meetod, mis esitab raske raskusastmega tehet, kus on vaja nelja erinevat arvu*/

    public void esitaKombineeritud2(int arv1, int arv2, int arv3, int arv4, char mark) {
        int vastus;
        int avaldis;
        if (mark == '+') {
            avaldis = ((arv1 + arv2) * arv3) / arv4;
        } else {
            avaldis = ((arv1 - arv2) * arv3) / arv4;
        }
        while (true) {
            System.out.print("(" + "(" + arv1 + mark + arv2 + ")" + " * " + arv3 + ")" + "/" + arv4 + " = ");
            Scanner s = new Scanner(System.in);
            try {
                String sisend = s.nextLine();
                if (sisend.equals("")) {
                    System.out.println("Õige vastus on: " + (avaldis));
                    break;
                } else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != avaldis) {
                        throw new Exception();
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vale vastus, proovi uuesti!");
            }
        }
    }


    @Override
    public void lihtne() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 24 + 1);
            int arv2 = (int) Math.round(Math.random() * 24 + 1);
            int arv3 = (int) Math.round(Math.random() * (arv1 + arv2));
            i++;
            esitaKombineeritud1(arv1, arv2, arv3, '+', '-');
        }
    }

    @Override
    public void keskmine() {
        int i = 0;
        while (i < tehted) {
            int arv3 = (int) Math.round(Math.random() * 5 + 1);
            int arv1 = arv3 * (int) Math.round(Math.random() * 5 + 2);
            int arv2 = (int) Math.round(Math.random() * 3 + 2);
            i++;
            esitaKombineeritud1(arv1, arv2, arv3, '*', '/');
        }
    }

    @Override
    public void raske() {
        for (int i = 0; i < this.tehted; i++) {
            int arv4 = (int) Math.round(Math.random() * 7 + 1);
            int arvAbi = arv4 * (int) Math.round(Math.random() * 23 + 2);
            int arv1 = arvAbi - (int) Math.round(Math.random() * (arvAbi - 2) + 1);
            int arv2 = arvAbi - arv1;
            int arv3 = (int) Math.round(Math.random() * 4 + 1);
            esitaKombineeritud2(arv1, arv2, arv3, arv4, '+');
        }

    }
}
