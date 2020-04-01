import java.util.Scanner;

public class Korrutamine {
    private int tehted;
    private int raskusaste;

    public Korrutamine(int tehted, int raskusaste) {
        this.tehted = tehted;
        this.raskusaste = raskusaste;
    }

    public void jooksuta() {
        if (raskusaste == 1) {
            lihtne();
        } else if (raskusaste == 2) {
            keskmine();
        } else {
            raske();
        }
    }

    public static void esita(int arv1, int arv2) {
        int vastus;
        while (true) {
            System.out.print(arv1 + " * " + arv2 + " = ");
            Scanner s = new Scanner(System.in);
            try {
                String sisend = s.nextLine();
                if (sisend.equals("")) {
                    System.out.println("Õige vastus on: " + (arv1 * arv2));
                    break;
                } else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != arv1 * arv2) {
                        throw new Exception();
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vale vastus, proovi uuesti!");
            }
        }
    }


    public void lihtne() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 5);
            int arv2 = (int) Math.round(Math.random() * 5);
            i++;
            esita(arv1, arv2);
        }
    }

    public void keskmine() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 10);
            int arv2 = (int) Math.round(Math.random() * 10);
            i++;
            esita(arv1, arv2);
        }
    }

    public void raske() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 15);
            int arv2 = (int) Math.round(Math.random() * 15);
            i++;
            esita(arv1, arv2);
        }
    }
}
