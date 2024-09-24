public class Lab_9_51 {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.inqueue(1);
        q1.inqueue(2);
        q1.inqueue(3);
        q1.inqueue(4);
        q1.inqueue(4);
        System.out.println(q1.dequeue());
        q1.dequeue();
        q1.inqueue(4);
        // q1.inqueue(4);
        q1.print();
    }
}
class Queue{
    int front = -1;
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
        if(rear == arr.length-1){
            rear = 0;
            arr[rear] = x;
        }
        else if(front <= rear){
            arr[++rear] = x;
            front = 0;
        }
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
        if(front < rear){
            System.out.println("");
        for(int i=front;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        }
        else if (rear < front){
            for(int i=front;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            front = 0;
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

