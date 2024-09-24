import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter at "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter num to replace with : ");
        int num = sc.nextInt();

        System.out.println("Enter new num : ");
        int newnum = sc.nextInt();

        for(int j=0;j<arr.length;j++){
          if(arr[j] == num){
            arr[j] = newnum;
            System.out.println("The indx replace is "+j);
            break;
          }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println("Elmt at "+k);
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
