public class Circuler_list {
    public static void main(String[] args) {
        Curculer_list c1 = new Curculer_list();
        c1.Add_first(1);
        c1.Add_last(2);
        c1.Add_first(3);
        c1.Add_last(9);
        // c1.delete_first();
        // c1.delete_Last();
        c1.print();
        c1.delete_Num(1);
        c1.print();
    }
}
class Curculer_list{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    public Node first = null;
    public Node last = null;

    public void Add_first(int data) {
        Node newNode = new Node(data);
        countNode();
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
            return;
        } 
            newNode.link = first;
            last.link = newNode;
            first = newNode;
    }
    int counter =0;
    public int countNode(){
        counter++;
        return counter;
    }
    public int countNodeM(){
        counter--;
        return counter;
    }

    public void Add_last(int data){
        countNode();
        Node newNode = new Node(data);
 
            last.link = newNode;
            last = newNode;
            last.link = first;
        
    }
    public void delete_first(){
        Node newNode = new Node(0);
            countNodeM();
        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
            return;
        }
            last.link = first.link;
            first = first.link;
    }
    public void delete_Last(){
        countNodeM();
        Node newNode = new Node(0);
        if(first == last){
            first = null;
        }
        if (first == null ) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } 
        else { 
            Node temp = first;
            while(temp.link != last){
                last = temp.link;
                last.link = first;
            }
        }
    }
    public void delete_Num(int num){
            countNodeM();
            Node temp = first;
            while(temp.link.info != num){
               temp = temp.link;
            }
            temp.link = temp.link.link;
            
    }
    public void print(){
        Node temp = first;
        System.out.println("total number of Nodes = "+(countNode()-1));
        if(temp == null){
            System.out.println("Tamari list empty chhe");
            return;
        }
       do{
            System.out.println(temp.info);
            temp = temp.link;
        }while(temp != first);
    }
}
