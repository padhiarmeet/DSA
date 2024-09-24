public class Lab_9_50 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10 );
        q1.inqueue(1);
        q1.inqueue(2);
        q1.inqueue(3);
        q1.inqueue(4);
        System.out.println(q1.dequeue());
        q1.print();
    }
}
class Queue{
    int front = 0;
    int rear = -1;
    int max;
    int arr[];

        Queue(int max){
            this.max = max;
            arr = new int[max];
        }

    public void inqueue(int x){
        if(rear >= max){
            System.out.println("Overflow chhe..");
            return;
        }
        arr[++rear] = x;
    }

    public int dequeue(){
        if(rear < 0){
            System.out.println("Underflow..");
            return 0;
        }
        int temp = arr[front];
        front++;
        return temp;
    }

    public void print(){
        System.out.println("");
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
