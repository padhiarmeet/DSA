import java.util.Scanner;

public class Insert1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int len = sc.nextInt();
        int arr[] = new int[len]; 

        for(int i=0;i<len;i++){
            System.out.println("Enter at indx : "+i);
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[len + 1];
        

        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int indx = 0;

        for(int i=1;i<arr.length;i++){
         if((num > arr[i-1]) && (num < arr[i])){
            indx = i;
            break;
         }
        }

        for(int i=0;i<arr1.length;i++){
            if(i<indx){
              arr1[i] = arr[i];
            }
            else if(i == indx){
              arr1[i] = num;
            }
            else{
              arr1[i] = arr[i-1];
            }
          }
        
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        sc.close();
    }
}
