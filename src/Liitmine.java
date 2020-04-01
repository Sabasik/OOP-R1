import java.util.Scanner;

public class Liitmine extends Tehe{
    public Liitmine(int tehted, int raskusaste) {
        super(tehted, raskusaste);
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

    public void esita(int arv1, int arv2) {
        int vastus;
        while (true) {
            System.out.print(arv1 + " + " + arv2 + " = ");
            Scanner s = new Scanner(System.in);
            try {
                String sisend = s.nextLine();
                if (sisend.equals("")) {
                    System.out.println("Õige vastus on: " + (arv1 + arv2));
                    break;
                } else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != arv1 + arv2) {
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
            int arv1 = (int) Math.round(Math.random() * 24 + 1);
            int arv2 = (int) Math.round(Math.random() * 24 + 1);
            i++;
            esita(arv1, arv2);
        }
    }

    public void keskmine() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 74 + 1);
            int arv2 = (int) Math.round(Math.random() * 74 + 1);
            i++;
            esita(arv1, arv2);
        }
    }

    public void raske() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 124 + 1);
            int arv2 = (int) Math.round(Math.random() * 124 + 1);
            i++;
            esita(arv1, arv2);
        }
    }
}