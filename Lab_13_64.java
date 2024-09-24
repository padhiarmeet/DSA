public class Lab_13_64{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(3);
        
        System.out.println("Original list:");
        list.printList();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.printList();
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
    Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.link = head;
        head = newNode;
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node temp = current;
            while (temp.link != null) {
                if (temp.link.info == current.info) {
                    temp.link = temp.link.link;
                } else {
                    temp = temp.link;
                }
            }
            current = current.link;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
