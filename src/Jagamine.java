import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Jagamine {
    int tehted;
    int raskusaste;

    public Jagamine(int tehted, int raskusaste) {
        this.tehted = tehted;
        this.raskusaste = raskusaste;
    }

    public void jooksuta(){
        if(raskusaste == 1){
            lihtne();
        }
        else if (raskusaste == 2){
            keskmine();
        }
        else{
            raske();
        }
    }
    public static void esita(int arv1, int arv2){
        int vastus = 0;
        while (true){
            System.out.print(arv1 + " / " + arv2 + " = ");
            Scanner s = new Scanner(System.in);
            try{
                String sisend = s.nextLine();
                if(sisend.equals("")){
                    System.out.println("Õige vastus on: " + (arv1 / arv2));
                    break;
                }
                else {
                    vastus = Integer.parseInt(sisend);
                    if (vastus != arv1 / arv2) {
                        throw new Exception();
                    }
                    break;
                }
            }catch (Exception e){
                System.out.println("Vale vastus, proovi uuesti!");
            }
        }
    }
    public int suvaline(){
        List<Integer> valik;
        if(this.raskusaste == 1){
            valik = Arrays.asList(0, 1, 2, 3, 4, 5);
        }
        else if(this.raskusaste == 2){
            valik = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        }
        else{
            valik = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        }
        return valik.get((int) (Math.random() * valik.size()));
    }
    public void lihtne(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = suvaline();
            int arv2 = suvaline();
            int arv = arv1 * arv2;
            esita(arv, arv1);
        }
    }
    public void keskmine(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = suvaline();
            int arv2 = suvaline();
            int arv = arv1 * arv2;
            esita(arv, arv1);
        }
    }
    public void raske(){
        for(int i = 0; i < this.tehted; i++){
            int arv1 = suvaline();
            int arv2 = suvaline();
            int arv = arv1 * arv2;
            esita(arv, arv1);
        }
    }
}