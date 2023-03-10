package task2;

public class ArrayCount {

    public static void main(String[] args) {
        int n = 4;
        int k = 6;
        int[] arr = {1, 5, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1 + i; j < arr.length; j++) {

                if (arr[i] + arr[j] == k) {
                    if (arr[i] + arr[j] == k) {

                        System.out.println(arr[i] + "+" + arr[j] + "=" + k);

                        }
                }

                }
            }
        }
    }