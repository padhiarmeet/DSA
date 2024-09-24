import java.util.Scanner;

public class Lab_18_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,5,8,9};
        int num = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        while(left < right){
           
            if(num > arr[mid]){
                left = mid+1;
            }
            else if(num < arr[mid]){
                right = mid;
            }
            else if(num == arr[mid]){
                System.out.println("your number is at index -"+mid);
                break;
            }
            mid = (left+right)/2;
        }
        sc.close();
    }
}
