public class Lab_10_59 {
    
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.add_last(5);
        l1.add_last(8);
        l1.add_last(10);
        l1.add_last(12);

        l2.add_last(5);
        l2.add_last(8);
        l2.add_last(10);
        l2.add_last(12);
        l1.print();
        l2.print();

        boolean a = l1.check(l2);
        System.out.println(a);  
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
    
    public void add_last(int data){
        Node n1 = new Node(data);
        if (first == null) {
            first = n1;
        } else {
            Node temp = first;
            while(temp.link != null){
                temp = temp.link;
            }
            temp.link = n1;
        }
    }
    public void print() {
        Node cNode = first;
        while (cNode != null) {
            System.out.print(cNode.info + " ");
            cNode = cNode.link; 
        }
        System.out.println();  
    }

    public boolean check(LinkedList l2){   
        Node temp1 = first;
        Node temp2 = l2.first;

        while(temp1 != null && temp2 != null){
            int one = temp1.info;
            int two = temp2.info;
            if(one != two){
                System.out.println("Both are not same...");
                return false;
            }
            temp1 = temp1.link;
            temp2 = temp2.link;
        }
        if (temp1 != null || temp2 != null) {
            System.out.println("Both are not same...");
            return false;
        }
        System.out.println("Both are same bro");
        return true;
    }
}
