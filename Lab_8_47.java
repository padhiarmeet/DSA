
import java.util.Stack;

public class Lab_8_47 {

    public static void main(String[] args) {
       
        Stack<Integer> s1 = new Stack<>();

        String s = "23+";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                s1.push(ch - '0');
            } 
            else {
                int o2 = s1.pop();
                int o1 = s1.pop();

                switch(ch){
                    case '+':
                        s1.push(o1 + o2);
                        break;
                    case '-':
                        s1.push(o1 - o2);
                        break;
                    case '*':
                        s1.push(o1 * o2);
                        break;
                    case '/':
                        s1.push(o1 / o2);
                        break;
                    default:
                        System.out.println("tame cherecter sachho nakho..");
                        return;
                }
            }
        }
        System.out.println("Ans of your expretion is = " + s1.pop());

    }

}