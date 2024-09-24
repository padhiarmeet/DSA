public class bst {
    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postoreder(Node root){
        if(root==null){
            return;
        }
        postoreder(root.left);
        postoreder(root.right);
        System.out.print(root.data+" ");
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static boolean search(Node root,int key){

        if(root == null) return false;
        if(root.data > key) return search(root.left, key);
        else if(root.data == key) return true;
        else return search(root.right, key);  
    }

    public static Node delete(Node root,int key){

        if(root == null) return root;

        if(key < root.data){
            root.left = delete(root.left, key);
        }
        else if(key > root.data){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            root.data = minVal(root.right);
            root.left = delete(root.left, root.data);
        }
        return root;
    }
    public static int minVal(Node root){

        int min = root.data;

        while (root.left != null) {
            root = root.left;
            min = root.data;
        }
        return min;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0;i<values.length;i++) root = insert(root,values[i]); 
        
        // inorder(root);

        // System.out.println("");

        // if(search(root, 7)) System.out.println("Found thai gyu bhai...");
        // else System.out.println("Found nathi thatu bhai...");

        delete(root, 14);
        inorder(root);

    }
}
