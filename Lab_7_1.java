import java.util.Scanner;

public class Lab_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        STACK s1 = new STACK();
        int step_count = 0;

        while(step_count==0){
            System.out.println("ENter  0 if you want to do it..... else enter enything else.....");
        step_count = sc.nextInt();

        System.out.println("What do you want to do ?");
        System.out.println("1 = PUSH");
        System.out.println("2 = POP");
        System.out.println("3 = peep");
        System.out.println("4 = change");
        System.out.println("5 = Display");
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("Enter how many element you want to add=");
            int count = sc.nextInt();
            for(int i=0;i<count;i++){   
                System.out.println("Enter element you want to enter....");
                int temp = sc.nextInt();
                s1.push(temp);
            }
            s1.display();
        }
        else if(number ==2){
            System.out.println("poped element = "+s1.pop());
            s1.display();
        }
        else if(number ==3){
            System.out.println("Enter what element you want to peep...");
            int x= sc.nextInt();
            System.out.println(s1.peep(x));
        }
        else if(number ==4){
            System.out.println("Enter index of elemnent you want to change");
            int index = sc.nextInt();
            System.out.println("ENter element you want to change...");
            int num = sc.nextInt();
            s1.change(index, num);
            s1.display();
        }
        else if(number == 5){
            s1.display();
        }
    }
        sc.close();
    }
}
class STACK{
    int top = -1;
    int max = 7;
    int arr[] = new int[max];

    public void push(int x){
        if(top >= max){
            System.out.println("Stack overflow thai gyo....");
            return;
        }
        arr[++top] = x;       
    }

    public int pop(){
        if(top ==-1){
            System.out.println("Stack under flow ma chhe maro bhai...");
            return 0;
        }
        int temp = arr[top];
        arr[top] = 0;
        top--;
        return (temp);
    }

    public void display(){
        for(int i=top;i>=0;i--){

                System.out.println(arr[i]);
        }   
    }

    public int peep(int i){
        if(top-i+1 <=0){
            System.out.println("Stack tamaro underflow ma che");
            return 0;
        }
        return arr[top - i + 1];
    }

    public void change(int i,int num){
        if(top-i+1 <=0){
            System.out.println("Stack tamaro underflow ma che");
            return;
        }
        arr[top - i +1] = num;
    }
}

