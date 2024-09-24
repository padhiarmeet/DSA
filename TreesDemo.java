import java.util.Queue;
import java.util.LinkedList;
public class TreesDemo {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root == null) return;
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);

       while(!q.isEmpty()){
        Node current = q.remove();
        if(current == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(current.data+" ");
            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);
        }
       }
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumNode(Node root){
        if(root == null) return 0;
        int leftNode = sumNode(root.left);
        int rightNode = sumNode(root.right);

        return leftNode + rightNode + root.data;
    }
    public static int heightTree(Node root){
        if(root == null) return 0;
        int leftNode = heightTree(root.left);
        int rightNode = heightTree(root.right);

        int totalHeight = Math.max(leftNode, rightNode) +1;

        return totalHeight;
    }
    public static int diameter(Node root){
        if(root == null) return 0;
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightTree(root.left) + heightTree(root.right) +1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }
    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    // public static TreeInfo Diameter2(Node root){
    //     if(root == null) new TreeInfo(0, 0);

    //     TreeInfo left = Diameter2(root.left);
    //     TreeInfo right = Diameter2(root.right);

    //     int tempHeight = Math.max(left.height,right.height) + 1;

    //     int dia1 = left.diameter;
    //     int dia2 = right.diameter;
    //     int dia3 = left.height + right.height +1;

    //     int maxDia = Math.max(Math.max(dia1,dia2),dia3);
        
    //     return maxDia;
    // }


    public static void main(String[] args) {
        int nodes[] = {1,2,3,-1,-1,4,-1,-1,5,-1,-1}; 
        Node root = BinaryTree.buildTree(nodes);
        preorder(root);
        System.out.println("");
        inorder(root);
        System.out.println("");
        postorder(root);
        // levelOrder(root);
        // System.out.println("count of node = "+countNode(root));
        // System.out.println("sum of node = "+sumNode(root));
        // System.out.println("height of node = "+heightTree(root));
        // System.out.println("Diameter of node = "+diameter(root));
        // // System.out.println("Diameter of node = "+Diameter2(root));
    }
}
