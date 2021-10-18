package Ukoly;

import java.util.Scanner;

public class Ukol4_1 {
    public static void main(String[] args) {

        final int zasobnik = 6;

        boolean hrajePocitac = true;
        int pocitej = 0;
        int poziceKulkyVBubinku = (int) (Math.random() * zasobnik); // pozice kulky v šestiranném bubínku revolveru
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * zasobnik); // říká, který z otvorů bubínku je vybrán ke střelbě

        System.out.println("Hraje PC");


        while (poziceKulkyVBubinku != poziceBubinku) {
            System.out.println("Nic!");
            poziceBubinku = (int) (Math.random() * zasobnik);
            if (poziceBubinku < 0) poziceBubinku = zasobnik - 1;
            if (poziceBubinku > zasobnik - 1) poziceBubinku = 0;


            hrajePocitac = !hrajePocitac;
            if (hrajePocitac) {
                System.out.println("Hraje PC");
            } else {
                System.out.println("Hraješ ty");
                System.out.println("Napiš true pro pokračování : ");
                Scanner vstup = new Scanner(System.in);
                boolean cvak = vstup.nextBoolean();
            }
        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi! :)");
        } else {
            System.out.println("Prohrál jsi :(");
        }

        // -- dodatečné úkoly --
        // přidat čekání na akci (zmáčknutí spouště) uživatele // Scanner
        // předělat magickou konstantu 6 na pojmenovanou konstantu a zkoušet hru s různými počty otvorů v revolveru //Final nastavit na všechny 6

        // předělat hru na extrémnější variantu, kde se od druhého pokusu už netočí a jde se dál,
        // - tady potřeba napojit konec bubínku na začátek bubínku, aby se pořád otáčel dokola (int proměnná, co se bude zvyšovat a pak modulo % nebo nulování za koncem)

    }
}
