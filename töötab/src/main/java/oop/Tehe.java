package oop;

public abstract class Tehe {
    protected int raskusaste;

    public Tehe(int raskusaste) {
        this.raskusaste = raskusaste;
    }

    public String[] jooksuta() {        // meetod, mis jooksutab vastava raskusastme ja kasutab selleks vastavat meetodit,
        if (raskusaste == 1) {      // see meetod käivitatakse peaklassis
            return lihtne();
        } else if (raskusaste == 2) {
            return keskmine();
        } else {
            return raske();
        }
    }

    public String[] esita(int arv1, int arv2, char mark) {     // kasutus ainult lihttehete puhul Saab sisendiks 2 arvu ja märgi
                                                           // ning seejärel tagastab tehte ja vastuse - meetod kutsutakse esile
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
        String tehe = arv1 + " " + mark + " " + arv2 + " = ";
        return new String[] {tehe, avaldis + ""};
    }

    public abstract String[] lihtne();    // abstraktsed meetodid, mis realiseeritakse igas alamklassis.
                                      // sisaldab suvaliste arvude genereerimist ning vastavat esita meetodit
    public abstract String[] keskmine();

    public abstract String[] raske();

}
