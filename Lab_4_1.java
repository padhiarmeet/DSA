import java.util.Scanner;

public class Lab_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j= 0;

        System.out.println("Enter size = ");
        int size = sc.nextInt();

        System.out.println("Enter array = ");
        int a[] = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter index = ");
        int index = sc.nextInt();
        System.out.println("enter number U want to add = ");
        int num = sc.nextInt();

        int b[] = new int[size+1];

        for(int i=0;i<size+1;i++){
            if(i == index){
                b[i] =num;
                j = i-1;
                
            }
            else{
                b[i] = a[j];
                
            }
            j++;
        }
        for(int i=0;i<size+1;i++){
           System.out.println(b[i]);
        }
        sc.close();
    }
}
