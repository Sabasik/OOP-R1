import java.util.Scanner;

public abstract class Tehe {
    protected int tehted;
    protected int raskusaste;

    public Tehe(int tehted, int raskusaste) {
        this.tehted = tehted;
        this.raskusaste = raskusaste;
    }

    public void jooksuta() {        // meetod, mis jooksutab vastava raskusastme ja kasutab selleks vastavat meetodit,
        if (raskusaste == 1) {      // see meetod käivitatakse peaklassis
            lihtne();
        } else if (raskusaste == 2) {
            keskmine();
        } else {
            raske();
        }
    }

    public void esita(int arv1, int arv2, char mark) {     // kasutus ainult lihttehete puhul Saab sisendiks 2 arvu ja märgi
        int vastus;                                       // ning seejärel prindib tehted ekraanile - meetod kutsutakse esile
        int avaldis;                                      // raskusastmete meetodites.
        if (mark == '+') {
            avaldis = arv1 + arv2;
        } else if (mark == '-') {
            avaldis = arv1 - arv2;
        } else if (mark == '*') {
            avaldis = arv1 * arv2;
        } else {
            avaldis = arv1 / arv2;
        }
        while (true) {
            System.out.print(arv1 + " " + mark + " " + arv2 + " = ");
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

    public abstract void lihtne();    // abstraktsed meetodid, mis realiseeritakse igas alamklassis.
                                      // sisaldab suvaliste arvude genereerimist ning vastavat esita meetodit
    public abstract void keskmine();

    public abstract void raske();

}
