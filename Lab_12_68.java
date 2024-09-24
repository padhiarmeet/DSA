public class Lab_12_68 {
    static class Node {
        int val;
        Node next;

        public Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static Node main(String[] args) {
        Node head = null;
        if(head == null || head.next == null) return head; 
        Node one = head;
        Node two = head.next;
        Node main = new Node(0);
        Node temp = main;
        
        while(one != null && two != null){
          temp.next = two;
          one.next = two.next;  
          two.next = one;
          temp = one;
          one = one.next;
  
          if(one!=null)two = one.next;
        }
        return main.next;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
