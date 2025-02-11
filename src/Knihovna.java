import java.util.Scanner;
public class Knihovna {
    static Scanner sc = new Scanner(System.in);
    int x;
    String kos;
    String[] knihy;
    int pocetStránek;


    public String[] hateovatPole() {
        System.out.println("Počet knih");
        x = sc.nextInt();
        kos = sc.nextLine();
        knihy = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Název knihly");
            knihy[i] = sc.nextLine();
        }
        return knihy;
    }

    public void vypis() {
        for (int k = 0; k < x; k++) {
            System.out.println("Kniha "+ (k+1) +" : "+ knihy[k]);
        }
    }






}
