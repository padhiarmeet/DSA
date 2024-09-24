public class Linked_list_operations {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add_first(1);
        l1.add_first(2);
        l1.add_first(3);
        l1.add_first(5);
        l1.add_first(6);
        l1.add_first(6);
        l1.add_last(10);
        l1.print();
        l1.delete(2);
        l1.reverseList();

    }
}
class LinkedList {
    class Node {
        int info;// stores value
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void add_first(int data) {
        Node n1 = new Node(data);

        if (first == null) {
            first = n1;
            return;
        }
        Node temp = first;
        first = n1;
        first.link = temp;
    }

    public void add_middle(int data) {

        Node newNode = new Node(data);
        if (first == null) {
            System.out.println("Stack overflow thai gyo bhai......");
            first = newNode;
            return;
        }
        Node current = first;
        while (newNode.info <= current.link.info) {
            current = current.link;
        }
        newNode.link = current.link;
        current.link = newNode;
    }

    public void add_last(int data) {
        Node n1 = new Node(data);

        if (first == null) {
            System.out.println("Stack underflow chhe maro bhai.....");
            first = n1;
            return;
        }
        Node temp = first;

        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = n1;
    }

    Node temp = first;

    public void delete(int index) {

        int i = 1;
        Node temp = first;
        while (i == index) {
            temp.info = temp.link.info;
            i++;
        }
        temp.link = temp.link.link;
    }

    public void deleteElement(int num) {

        Node temp = first;
        while (temp.link.info == num) {
            temp.info = temp.link.info;
        }
        temp.link = temp.link.link;
    }

    public void reverseList() {
        Node prev = null;
        Node current = first;

        while (current != null) {
            Node nextNode = current.link;
            current.link = prev;
            prev = current;
            current = nextNode;
        }
        current = prev;
        //To print the LinkList .
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.link;
        }
        System.out.println();
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
