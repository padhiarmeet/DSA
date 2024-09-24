import java.util.Scanner;

public class Lab_18_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,1,8,5,0,3,5};
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                System.out.println("Your numbers index is = "+i);
                break;
            }
        }
        sc.close();
    }
}
