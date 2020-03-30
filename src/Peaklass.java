import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        Lahutamine l1 = new Lahutamine(5, 1);
        l1.jooksuta();
        Lahutamine l2 = new Lahutamine(5, 2);
        l2.jooksuta();
        Lahutamine l3 = new Lahutamine(5, 3);
        l3.jooksuta();
    }
    public static int raskusaste(){
        int r = 0;
        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("Vali raskusaste:\nlihtne - sisesta 1\n"
                    + "keskmine - sisesta 2\nraske - sisesta 3");
            try{
                r = Integer.parseInt(s.nextLine());
                if(r < 1 || r > 3){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.println("Palun sisesta arv 1, 2 või 3!");
            }
        }
        return r;
    }
}
