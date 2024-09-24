import java.util.Scanner;

public class VowCons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char : ");
         char c = sc.next().charAt(0);

    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u'){
        System.out.println("Vowel");
    }
    else{
        System.out.println("Cons");
    }
    sc.close();
    }
}