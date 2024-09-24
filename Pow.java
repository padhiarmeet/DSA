import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int num = sc.nextInt();

        System.out.println("Enter pow : ");
        int pow = sc.nextInt();

        int ans = 1;
        for(int i=1;i<=pow;i++){
            ans = ans*num;
        }
        System.out.println("ans is "+ans);
        sc.close();
    }
}
