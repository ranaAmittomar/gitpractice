public class BST {

    public static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int value){
            data = value;
            leftNode =null;
            rightNode=null;
        }

    }

    public static Node insNode(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data>value){
            root.leftNode =insNode(root.leftNode, value);
        }
        else{
            root.rightNode = insNode(root.rightNode, value);
        }
        return root;
    }
    public static void inOrder(Node root){
        //        System.out.println("Inorder");
        if(root==null){
            return;
        }
        //        System.out.print(root.data+" ");
        inOrder(root.leftNode);
        System.out.println(root.data+" ");
        inOrder(root.rightNode);
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public static void postOrder(Node rooNode){
        if(rooNode==null){
            return;
        }   
        postOrder(rooNode.leftNode);
        postOrder(rooNode.rightNode);
        System.out.println(rooNode.data +" ");
    }
    
    

    public static void main(String[] args) {
        int[] bin = {2,4,45,2,12,45,65};
        Node root =null;
        for(int i=0;i<bin.length-1;i++){
            root = insNode(root, bin[i]);
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
    
}
