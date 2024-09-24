public class StackUsingLL {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.push(0);
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.pop();
        l1.print();
    }
}
class LinkedList {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;

    public void push(int data) {
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;
            return;
        }
        Node temp = first;
        first = n1;
        first.link = temp;
    }
    public void set(int index,int value){
        Node temp = first;
        int count = 0;
        while(count != index){
            count++;
            temp = temp.link;
        }
        temp.info = value;
    }

    public int pop() {
        int val = first.info;
        first = first.link;
        return val;
    }

    public int peep(){
      return first.info;  
    }

    public void print() {
        Node cNode = first;
        while (cNode != null) {
            System.out.print(cNode.info + " ");
            cNode = cNode.link;
        }
        System.out.println();
    }
}