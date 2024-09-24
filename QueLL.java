public class QueLL {
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.push(0);
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.dequeue();
        l1.print();

    }
}
class LinkList{

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
    
        while (temp.link != null) { 
            temp = temp.link;
        }
        temp.link = n1;
    }

    public int dequeue() {
        int val = first.info;
        first = first.link;
        return val;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.info);
            temp = temp.link;
        }
    }

}
