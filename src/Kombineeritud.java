import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kombineeritud extends Tehe {
    public Kombineeritud(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }

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
            int arv1 = (int) Math.round(Math.random() * 9 + 1);
            int arv3 = (int) Math.round(Math.random() * 2 + 1);
            int arv2 = arv3 * (int) Math.round(Math.random() * 4 + 1);
            i++;
            esitaKombineeritud1(arv1, arv2, arv3, '*', '/');
        }
    }

    @Override
    public void raske() {
        List<Integer> valik;
        valik = Arrays.asList(0, 1, 2, 3, 4, 5);
        for (int i = 0; i < this.tehted; i++) {
            int arv1 = (int) Math.round(Math.random() * 19 + 1);
            int arv2 = (int) Math.round(Math.random() * arv1);
            int arv4 = valik.get((int) (Math.random() * valik.size()));
            int arv3 = arv4 * (int) Math.round(Math.random() * 4 + 1);    //lisada juhuslikult lahutamist ka sisse?
            esitaKombineeritud2(arv1, arv2, arv3, arv4, '+');
        }

    }
}
