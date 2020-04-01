import java.util.Scanner;

public class Lahutamine extends Tehe{

    public Lahutamine(int tehted, int raskusaste) {
        super(tehted, raskusaste);
    }

    public void esita(int arv1, int arv2){
        int vastus = 0;
        while (true){
            System.out.print(arv1 + " - " + arv2 + " = ");
            Scanner s = new Scanner(System.in);
            try{
                String sisend = s.nextLine();
                if(sisend.equals("")){
                    System.out.println("Õige vastus on: " + (arv1 - arv2));
                    break;
                }
                else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != arv1 - arv2) {
                        throw new Exception();
                    }
                    break;
                }
            }catch (Exception e){
                System.out.println("Vale vastus, proovi uuesti!");
            }
        }
    }
    public void lihtne(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = (int) Math.round(Math.random() * 50);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2);
        }
    }
    public void keskmine(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = (int) Math.round(Math.random() * 150);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2);
        }
    }
    public void raske(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = (int) Math.round(Math.random() * 250);
            int arv2 = (int) Math.round(Math.random() * arv1);
            esita(arv1, arv2);
        }
    }
}
