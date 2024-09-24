public class Lab_12_66 {
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.add_first(1);
        l1.add_first(2);
        l1.add_first(3);
        l1.add_first(5);
        l1.add_first(6);
        l1.add_first(7);
        l1.add_first(8);
        l1.swap(2);
        l1.print();
    }
}
class LinkList{
    class Node{
        int info;
        Node link;
        Node(int data){
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

    public void swap(int num){
        int count = 0;
        Node temp1 = first;
        while(temp1 != null){
            count++;
            temp1 = temp1.link;
        }
        temp1 = first;
        int num2 = count -num + 1;
        Node left1 = first;
        Node right1 = first;
        Node left2 = first;
        Node right2 = first;
        Node center1 = first;
        Node center2 = first;
        for(int i=0;i<num;i++){
            center1 = center1.link;
        }
        left1 = center1;
        center1 = center1.link;
        right1 = center2;

        for(int i=0;i<num2;i++){
            center2 = center2.link;
        }
        left2 = center2;
        center2 = center2.link;
        right2 = center2;
        int i = 0;

        while(temp1.link!=null ){

            if(i == num || i==count){
                temp1.link = left2.link;
                temp1 = temp1.link;
                temp1.link = right1;
            }
            else if(i == num2-1){
                temp1.link = center1;
                temp1 = temp1.link;
                temp1.link = right2;
                break;
            }
            else{
                temp1 = temp1.link;
            }
            i++;
        }
            temp1 = first;
            Node cNode = temp1;
            while (cNode != null) {
                System.out.print(cNode.info + " ");
                cNode = cNode.link;
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
