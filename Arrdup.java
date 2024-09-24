import java.util.Scanner;

public class Arrdup {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter at "+i);
            arr[i] = sc.nextInt();
        }
        boolean con = false;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;j<arr.length;j++){
                if(arr[j] == arr[k]){
                    con = true;
                    break;
                }
            }
        }
        
        if(con == true){
            System.out.println("Duplicate contains");
        }
        else{
            System.out.println("No duplicate");
        }
        sc.close();
    }
}
