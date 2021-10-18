package Ukoly;
import java.util.Scanner;
public class Ukol4 {
    public static void main(String[] args) {



        int nahodneCislo = (int) (Math.random() * 100) + 1; // hranice od kud po kud
        System.out.print("Máš 10 pokusů na to aby jsi zadal číslo od 1 do 100,\nTvoje první číslo: ");
        int i = 1;


        while (i != 0){
            Scanner vstup = new Scanner(System.in);
            int cislo = vstup.nextInt();
            if (cislo == nahodneCislo) {
                System.out.println("Trefil ses na " + i + ". pokus");
                i = 0;
            }
            if (cislo > nahodneCislo) {
                System.out.println("Mé číslo je menší");
                i++;
            }
            if (cislo < nahodneCislo) {
                System.out.println("Mé číslo je větší");
                i++;
            }
            if (i == 10  ){
                System.out.println("Použil jsi všechny své pokusy, takže prohráváš."); break;


            }


        }
    }
}
