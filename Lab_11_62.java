public class Lab_11_62 {
    public static void main(String[] args) {
        
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
    public void removeDuplicates(){
        Node temp = first;
        Node temp1 = first.link;
        while(temp != null && temp1 != null){
            if(temp.info == temp1.info){
                temp.link = temp.link.link;
                temp = temp.link;
            }
            temp1=temp1.link;
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
}

