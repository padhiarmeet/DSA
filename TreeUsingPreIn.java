public class TreeUsingPreIn {
    public static void main(String[] args) {
        int pre[] = {1, 2, 4, 8, 9, 5, 3, 6, 7}; 
        int post[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};

        contree(pre, post, 9);

    }
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
    static int preindex;

    static Node constructTree(int pre[],int post[],int l,int h,int size){
        if(preindex >= size || l > h)return null;
        Node root = new Node(pre[preindex]);
        preindex++;
        int i;
        for(i=1;i<=h;i++){
            if(post[i] == pre[preindex]);
            break;
        }
        if(i<=h){
            root.left = constructTree(pre, post, l, i, size);
            root.right = constructTree(pre, post, i+1, h-1, size);   
        }
        return root;
    }
    static Node contree(int pre[],int post[],int size){
            preindex = 0;
            return constructTree(pre, post, 0 ,size-1,size);
    }
    static void printInorder(Node root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
}


