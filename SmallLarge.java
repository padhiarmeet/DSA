import java.util.*;
public class SmallLarge {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter at "+i);
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        int large = arr[0];

        for(int j=1;j<arr.length;j++){
            if(arr[j] < small){
                small = arr[j];
            }
            if(arr[j] > large){
                large = arr[j];
            }
           
        }

        
        System.out.println("Smallest is :  "+small+" Largest is : "+large);
        sc.close();
    }
}

