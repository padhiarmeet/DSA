public class Lab_13_73{
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.addFirst(0);
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.addFirst(6);
        l1.DeleteAlter();
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
    
   public void DeleteAlter(){
    Node temp = head;
    while(temp.next != null && temp.next.next != null && temp != null){
        
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
    }
   }
    public void print() {
        Node cNode = head;
        while (cNode != null) {
            System.out.print(cNode.info + " ");
            cNode = cNode.next;
        }
        System.out.println();
    }
}

