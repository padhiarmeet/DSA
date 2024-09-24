import java.util.*;

public class Avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        float ans = (sum/n);

        System.out.println("Avg is : "+ans);
        sc.close();
    }
}
