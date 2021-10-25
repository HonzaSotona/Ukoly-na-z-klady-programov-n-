package Ukoly;

public class Ukol5_1 {
    public static boolean vloz(int num, int x, int y, int [][] array) {

        vloz(45, 1, 1, array);
        if (!(x > array.length || y > array.length || x < 0 || y < 0)) {
            System.out.println(array[0].length);
            System.out.println(array.length);

            array[x][y] = num;

            return true;
        } else return false;
    }
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Array1: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}



