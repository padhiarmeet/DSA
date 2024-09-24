import java.util.Scanner;

public class FindArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r : ");
        float r = sc.nextFloat();
        double area = (Math.PI)*r*r;
        System.out.println("Area is "+area);
        sc.close();
    }
}