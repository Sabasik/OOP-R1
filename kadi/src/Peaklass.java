import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        System.out.println("Tere tulemast arvutama!");
        while (true) {
            instruktsioonid();
            String sisend;
            Scanner s = new Scanner(System.in);
            sisend = s.nextLine();
            if (sisend.equals("exit")) {
                break;
            } else {
                try {
                    int teema = Integer.parseInt(sisend);
                    if (teema == 1) {
                        int r = raskusaste();
                        int mitu = mituTehet();
                        Liitmine li = new Liitmine(mitu, r);
                        li.jooksuta();
                    } else if (teema == 2) {
                        int r = raskusaste();
                        int mitu = mituTehet();
                        Lahutamine la = new Lahutamine(mitu, r);
                        la.jooksuta();
                    } else if (teema == 3) {
                        int r = raskusaste();
                        int mitu = mituTehet();
                        Korrutamine k = new Korrutamine(mitu, r);
                        k.jooksuta();
                    } else if (teema == 4) {
                        int r = raskusaste();
                        int mitu = mituTehet();
                        Jagamine j = new Jagamine(mitu, r);
                        j.jooksuta();
                    } else if (teema == 5) {
                        int r = raskusaste();
                        int mitu = mituTehet();
                        Kombineeritud kmb = new Kombineeritud(mitu, r);
                        kmb.jooksuta();
                    }
                } catch (Exception e) {
                    System.out.println("Palun sisesta midagi etteantud valikust!");
                }
            }
        }

    }

    public static void instruktsioonid() {
        System.out.println("Mida soovid teha? Saab liita, lahutada, korrutada ja jagada.");
        System.out.println("Lisaks on võimalik teha kombineeritud tehteid.");
        System.out.println("Võimalik on valida kolme raskusastme vahel.");
        System.out.println("Kui mõnele tehtele vastust ei tea, vajuta lihtsalt ENTER.");
        System.out.println("Kui soovid väljuda, sisesta 'exit'.");
        System.out.println("Liitmine - sisesta 1");
        System.out.println("Lahutamine - sisesta 2");
        System.out.println("Korrutamine - sisesta 3");
        System.out.println("Jagamine - sisesta 4");
        System.out.println("Kombineeritud tehted - sisesta 5");
    }

    public static int mituTehet() {
        int mitu;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Mitu tehet soovid teha?");
            try {
                mitu = Integer.parseInt(s.nextLine());
                if (mitu < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Palun sisesta positiivne täisarv!");
            }
        }
        return mitu;
    }

    public static int raskusaste() {
        int r;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Vali raskusaste:\nlihtne - sisesta 1\n"
                    + "keskmine - sisesta 2\nraske - sisesta 3");
            try {
                r = Integer.parseInt(s.nextLine());
                if (r < 1 || r > 3) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Palun sisesta arv 1, 2 või 3!");
            }
        }
        return r;
    }
}
