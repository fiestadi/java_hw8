package task3;

public class ArrayCount2 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[] array = {1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 1 + i; i1 < array.length ; i1++) {
                if (array[i] + array[i1] == k) {
                    System.out.println(array[i] + "+" + array[i1] + "=" + k);

                            }
                        }
                    }
                }
            }


