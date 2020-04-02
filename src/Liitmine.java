public class Liitmine extends Tehe {
    public Liitmine(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }

    public void lihtne() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 24 + 1);
            int arv2 = (int) Math.round(Math.random() * 24 + 1);
            i++;
            esita(arv1, arv2, '+');
        }
    }

    public void keskmine() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 50 + 25);
            int arv2 = (int) Math.round(Math.random() * 50 + 25);
            i++;
            esita(arv1, arv2, '+');
        }
    }

    public void raske() {
        int i = 0;
        while (i < tehted) {
            int arv1 = (int) Math.round(Math.random() * 50 + 75);
            int arv2 = (int) Math.round(Math.random() * 50 + 75);
            i++;
            esita(arv1, arv2, '+');
        }
    }
}