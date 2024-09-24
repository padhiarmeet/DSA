import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[5];
        int count = 0;
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i=a.length-1;i>1;i--){
            for(int j=0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count = 1;
                }
            }
            if(count == 0)break;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}