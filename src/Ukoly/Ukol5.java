package Ukoly;

public class Ukol5 {

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int averageNum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total/ array.length;
    }

        public static void main (String[]args){
            // Vytvorte 1D pole1 o velikosti 10 s čísly 1-10                                                   // DONE
            // Vytvorte 1D pole2 o velikosti 10 s náhodnými čísli 0-10 //  nevím zda jsem to pochopil správně  // DONE

            int[] pole1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] pole2 = {5,8 ,17 ,9 ,20 ,30 ,25 ,15 ,18 ,35, 40 };


            // Vytvořte funkce zjistujici minimální hodnotu prvku v poli,                                      // DONE
            // sumu a průměru prvků                                                                            // DONE
            // Vypočítané hodnoty vypiště do konzole                                                           // DONE
            System.out.println("Maximum number for pole1: "  + max(pole1));
            System.out.println("Maximum number for pole2: "  + max(pole2));
            System.out.println("Minimum number for pole1: "  + min(pole1));
            System.out.println("Minimum number for pole2: "  + min(pole2));
            System.out.println("Sum number for pole1 : "     + sum(pole1));
            System.out.println("Sum number for pole1 : "     + sum(pole2));
            System.out.println("Average number for pole1 : " + averageNum(pole1));
            System.out.println("Average number for pole1 : " + averageNum(pole2));


        }
    }



