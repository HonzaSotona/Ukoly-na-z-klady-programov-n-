package Ukoly;
import java.util.Scanner;
public class Ukol4 {



        private boolean insert(int num, int x, int y, int[][] arr) {
            printArr(arr);

            if (!(x > arr.length || y > arr[0].length || x < 0 || y < 0)) {
                arr[x][y] = num;
                printArr(arr);
                System.out.println(" ");
                return true;
            } else return false;
        }


        private void printArr(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "    ");
                }
                System.out.println();
                System.out.println(" ");
            }
        }

        private int[][] initArr(int size) {
            int[][] arr = new int[size][size];
            System.out.println(" ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = (i + 1) * (j + 1);
                }
            }
            return arr;
        }


        private Ukol4() {
            int[] arr = new int[]{1, 5, 9, 2, 43, 1, 7, 23};

            int[][] arr2 = initArr(6);
            printArr(arr2);
            insert(88, 2, 2, arr2);
        }

        public static void main(String[] args) {
            new Ukol4 ();
        }
    }