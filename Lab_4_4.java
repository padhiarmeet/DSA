import java.util.Scanner;
import java.util.Arrays;

public class Lab_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;

        System.out.println("Enter size = ");
        int size = sc.nextInt();

        System.out.println("Enter array = ");
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter index = ");
        int index = sc.nextInt();

        int b[] = new int[size - 1];

        for (int i = 0; i < size; i++) {
            if (i == index) {
                j = i;
                continue;
            } else {
                b[j] = a[i];
                j++;
            }

        }
        for (int i = 0; i < size - 1; i++) {
            System.out.println(b[i]);
        }
        sc.close();
    }
}

