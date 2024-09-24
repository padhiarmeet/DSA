import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int len = sc.nextInt();
        int arr[] = new int[len]; 

        for(int i=0;i<len;i++){
            System.out.println("Enter at indx : "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");

        int arr1[] = new int[len-1];

        System.out.println("Enter index to remove : ");
        int indx = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(i<indx){
                arr1[i] = arr[i];
            }
            else if(i == indx){
                continue;
            }
            else{
                arr1[i-1] = arr[i];
            }
            
        }
        System.out.println(" ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        sc.close();
        }
}
