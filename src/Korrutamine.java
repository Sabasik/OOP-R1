public class Korrutamine extends Tehe{
    public Korrutamine(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }

    public void lihtne() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 5);
            int arv2 = (int) Math.round(Math.random() * 5);
            i++;
            esita(arv1, arv2,'*');
        }
    }

    public void keskmine() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 10);
            int arv2 = (int) Math.round(Math.random() * 10);
            i++;
            esita(arv1, arv2,'*');
        }
    }

    public void raske() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 15);
            int arv2 = (int) Math.round(Math.random() * 15);
            i++;
            esita(arv1, arv2,'*');
        }
    }
}
