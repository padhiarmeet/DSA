import java.util.Stack;

public class Lab_8_45 {
    public static void main(String[] args) {

        Stack<Character> s1 = new Stack<>();

        String infix = "(a+b*c/d-e+f/g/(h+i))";
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<infix.length(); i++){

            if(infix.charAt(i) == '('){
                s1.push('(');
            }
            else if(Character.isAlphabetic(infix.charAt(i))){

                ans.append(infix.charAt(i));
            }
            else if(infix.charAt(i) == '+' || infix.charAt(i) == '*' || infix.charAt(i) == '/' || infix.charAt(i) == '-' || infix.charAt(i) == '^'){

                while (!s1.isEmpty() && s1.peek() != '(' && precidence(s1.peek()) >= precidence(infix.charAt(i))) {
                    ans.append(s1.pop());
                }
                s1.push(infix.charAt(i));
            }
            else{

                while(s1.peek() != '('){
                    ans.append(s1.pop());
                }
                if (!s1.isEmpty() && s1.peek() == '(') {
                    s1.pop();
                }
            }

        }
        while (!s1.isEmpty()) {
            ans.append(s1.pop());
        }
        System.out.println(ans);
    }   
    
    public static int precidence(char ch){
        switch (ch) {
            case '+':
            case '-':return 1;     
            case '*':
            case '/':return 2;
            case '^': return 3;
        } 
        return -1;
    }
}
