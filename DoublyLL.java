public class DoublyLL {
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.addFirst(0);
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addLast(10);
        l1.addMiddle(2, 12);
        l1.print();
        l1.delete(3);
        l1.print();
    }
}
class LinkList{
    class Node{
       int info;
       Node next;
       Node prev;

       public Node(int data){
        this.info = data;
        this.next = null;
        this.prev = null;
       }
    }
    Node head = null;
    Node tail = null;
    //Insert at first position.
    public void addFirst(int data){

        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        head.prev = temp;
        temp.next = head;
        temp.prev = null;
        head  = temp;
    }
    //Intert at last position
    public void addLast(int data){
        Node temp = new Node(data);
        
        if(tail == null){
            head = tail;
            tail = temp;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        temp.next = null;
        tail = temp;
    }
    //Insert at middle position.
    public void addMiddle(int index,int data){
        Node temp = new Node(data);
        Node current = head;

        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        int count = 1;
        while(count < index && current != null){
            count++;
            current = current.next;
        }
        temp.next = current;
        temp.prev = current.prev;
        current.prev.next = temp;
        current.prev = temp;
    }
    //Delete Element
    public void delete(int index){
        Node temp = head;
        int count = 1;
        while(count < index){
            count++;
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    //To print the DD list
    public void print() {
        Node cNode = head;
        System.out.println(tail.prev.prev.prev.info);
        while (cNode != null) {
            System.out.print(cNode.info + " ");
            cNode = cNode.next;
        }
        System.out.println();
    }
}

