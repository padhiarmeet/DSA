public class Lab_12_67 {
    static class Node {
        int val;
        Node next;

        public Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node curr = head;

        for (int i = 1; i < 5; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }

        insertGCDNodes(head);
        printList(head);
    }

    public static void insertGCDNodes(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.next != null) {
            prev = curr;
            curr = curr.next;
            Node temp = new Node(gcd(prev.val, curr.val));
            temp.next = prev.next;
            prev.next = temp;
            prev = temp;
        }
    }

    static int gcd(int x, int y) {
        int greater = x > y ? x : y;
        int smaller = x < y ? x : y;
        int tempNum = smaller;
        
        while (greater % smaller != 0) {
            tempNum = greater % smaller;
            greater = smaller;
            smaller = tempNum;
        }
        
        return tempNum;
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
