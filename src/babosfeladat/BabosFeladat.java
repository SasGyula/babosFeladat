package babosfeladat;

import java.util.Random;
import java.util.Scanner;

public class BabosFeladat {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {
        jatek();
    }
    public static void jatek(){
        int babokSzama = mennyiBab();
        boolean nyertel = false;
        while(babokSzama > 0){
            int jatekosLep = 0;
            int gepLep = 0;
            if(babokSzama>0){
                jatekosLep = jatekosLep(babokSzama);
                babokSzama = babokSzama-jatekosLep;
                nyertel = true;
            }
            if(babokSzama>0){
                gepLep = gepLep(babokSzama);
                babokSzama = babokSzama-gepLep;
                nyertel = false;
            }
            System.out.println("Gép elvett: " + gepLep);
            System.out.println("Fennmaradó babok: "+babokSzama);
        }   
        System.out.println(nyertel ? "Nyertel":"Nem nyertél");
}
    public static int mennyiBab(){
        System.out.print("Mennyi babot szeretnél?");
        int babokSzama = sc.nextInt();
        return babokSzama;
    }
    public static int jatekosLep(int babokSzama){
        System.out.print("Mennyit szeretnél elvenni?");
        int jatekosLep = sc.nextInt();
        while(jatekosLep<1 || jatekosLep>2){
            System.out.print("Mennyit szeretnél elvenni?");
            jatekosLep = sc.nextInt();
        }
        return jatekosLep;
    }
    public static int gepLep(int babokSzama){
        int gepLepes = rnd.nextInt(1,3);
        return gepLepes;
    }
    public static void kiir(){
        System.out.println();
    }
}
