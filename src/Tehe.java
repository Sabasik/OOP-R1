public abstract class Tehe {
    protected int tehted;
    protected int raskusaste;

    public Tehe(int tehted, int raskusaste) {
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

    public abstract void esita(int arv1, int arv2);  //meetod, mis

    public abstract void lihtne();

    public abstract void keskmine();

    public abstract void raske();

}
