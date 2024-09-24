public class Lab_13_74 {
    public static void main(String[] args) {
        Circuler_list list = new Circuler_list();
        list.add_first(5);
        list.add_first(4);
        list.add_first(3);
        list.add_first(2);
        list.add_first(1);

        list.splitList();
    }
}
class Circuler_list{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;
    Node last = null;

    public void add_first(int data){
        Node newNode = new Node(data);
        if(first == null){
            newNode.link = newNode;
            first = newNode;
            last = newNode;
            return;
        }
        newNode.link = first;
        last.link = newNode;
        first = newNode;
    }
    public void splitList() {
        Node slow = first;
        Node fast = first;

        if (first == null) {
            return;
        }

        while (fast.link != first && fast.link.link != first) {
            fast = fast.link.link;
            slow = slow.link;
        }

        if (fast.link.link == first) {
            fast = fast.link;
        }
        Node head1 = first;
        Node head2 = slow.link;
        fast.link = slow.link;//second list ne circuler kari.
        slow.link = first;//first ne circuler kari.

        System.out.println("First half:");
        printList(head1, slow);

        System.out.println("Second half:");
        printList(head2, fast);
    }

    public void printList(Node start, Node end) {
        Node temp = start;
        if (start != null) {
            do {
                System.out.print(temp.info + " ");
                temp = temp.link;
            } while (temp != start && temp != end.link);
            System.out.println();
        }
    } 
}
