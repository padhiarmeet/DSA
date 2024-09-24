import java.util.*;
public class Arr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter at "+i);
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.println("Elmt at "+j);
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
