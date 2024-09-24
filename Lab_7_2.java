public class Lab_7_2 {
    public static void main(String[] args) {
        STACK s1 = new STACK();
         s1.push();
         s1.check();
    }
}
class STACK{
    String s = "abcba ";
    char arr[] = new char[10];
    int top = 1;
   
    public void push(){
        
        if(top >= 10){
            System.out.println("Stack overflow thai gyo....");
            return;
        }
        arr[0] = 'c';
        while(s.charAt(top-1)!='c'){
            arr[top] = s.charAt(top-1);     
            top++;
        }
    }
    public char pop(){

        if(top ==-1){
            System.out.println("Stack under flow ma chhe maro bhai...");
            return 0;
        }
        char temp = arr[top];
        arr[top] = ' ';
        top--;
        return (temp);
    }
    public void check(){

        int i=0;
       while(arr[top] != 'c'){
        char temp = s.charAt(i);
        char x = pop();
        if(x != temp){
            return;
        }
        i++;
       }
       char temp = s.charAt(i);
       if(temp == ' '){
        System.out.println("valid chhe");
       }
       else{
        System.out.println("valid nathi");
       }
    }
}
