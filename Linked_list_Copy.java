public class Linked_list_Copy {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.AddFirst(4);
        l1.AddFirst(3);
        l1.AddFirst(2);
        l1.AddFirst(1);

        l1.copy();
        l1.print();
    }
}
class LinkedList{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;

    public void AddFirst(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }
   
    public void copy() {
        if (first == null) {
            return;
        }
        Node temp = first;
        Node newTemp = new Node(temp.info);
        Node head1 = newTemp;
        first = newTemp;

        while (temp.link != null) {
            temp = temp.link;
            newTemp.link = new Node(temp.info);
            newTemp = newTemp.link;
        }
       
        while (head1 != null) {
            System.out.print(head1.info + " ");
            head1 = head1.link; 
        }
        System.out.println(); 
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link; 
        }
        System.out.println();  
    }
}