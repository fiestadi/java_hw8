package task1;
import java.util.Scanner;
public class Array {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int[] array = new int[a - 1];
                for (int i = 0; i < a - 1; i++) {
                    array[i] = scanner.nextInt();
                }

                int xNumber = 0;
                for (int i = 1; i <= a; i++) {
                    boolean found = false;
                    for (int j = 0; j < a - 1; j++) {
                        if (array[j] == i) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        xNumber = i;
                        break;

                    }
                }
                System.out.println(xNumber);
            }
}

