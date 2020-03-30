import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        int r = raskusaste();
        int mitu = mituTehet();
        Lahutamine l1 = new Lahutamine(mitu, r);
        l1.jooksuta();
    }
    public static int mituTehet(){
        int mitu = 0;
        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("Mitu tehet soovid teha?");
            try{
                mitu = Integer.parseInt(s.nextLine());
                if(mitu < 1){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.println("Palun sisesta positiivne täisarv!");
            }
        }
        return mitu;
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
