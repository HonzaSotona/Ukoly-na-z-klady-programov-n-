package Ukoly;

public class Ukol5_2 {
        // TODO vytvorte pole o velikosti 10 s nahodnymi cisly 0-10
        // vytvorte metodu setrid, ktera seradi prvky pole vzestupne    // DONE
        // napr: {5, 6, 7 ,3 } -> {3, 5, 6, 7}
        // muzete vyuzit napr algoritmu bubble sort                     // Created throught bubble sort

        static class BubbleSort
        {
            void bubbleSort(int array[])
            {
                int n = array.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (array[j] > array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
            }

            void printArray(int array[])
            {
                int n = array.length;
                for (int i = 0; i < n; ++i)
                    System.out.print(array[i] + " ");
                System.out.println();
            }


            public static void main(String args[])
            {
                BubbleSort ob = new BubbleSort();
                int array[] = {5,8 ,17 ,9 ,20 ,30 ,25 ,15 ,18 ,35,50 };
                ob.bubbleSort(array);
                System.out.println("Sorted numbers : ");
                ob.printArray(array);
            }
        }
}
