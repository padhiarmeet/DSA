import java.util.Scanner;

public class RecurFact {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        Fact fa = new Fact();
        int ans = fa.Find(a);
        System.out.println(ans);
        sc.close();
    }
}
class Fact{
    public int Find(int a){
        if(a==0 || a==1){

            return 1;
        }
        return a * Find(a-1);
    }
}