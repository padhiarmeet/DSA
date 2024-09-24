import java.util.Stack;

public class Lab_8_46 {
    public static void main(String[] args) {

        Stack<Character> s1 = new Stack<>();

        String temps = "(a+b*c/d-e+f/g/(h+i))";
        StringBuilder infix = new StringBuilder();

        for(int i = temps.length()-1;i>=0;i--){
            if(temps.charAt(i)==')'){
                infix.append('(');
            }
            else if(temps.charAt(i)=='('){
                infix.append(')');
            }
            else{
                infix.append(temps.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<infix.length(); i++){
            char ch = infix.charAt(i);

            if(ch == '('){
                s1.push('(');
            }
            else if(Character.isAlphabetic(ch)){
                ans.append(ch);
            }
            else if(ch == '+' || ch == '*' || ch == '/' || ch == '-' || ch == '^'){

                while (!s1.isEmpty() && s1.peek() != '(' && precidence(s1.peek()) > precidence(ch)) {
                    ans.append(s1.pop());
                }
                s1.push(ch);
            }
            else if(ch == ')'){

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
        System.out.println(ans.reverse());
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
