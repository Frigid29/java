import java.util.*;
class AVL{

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public AVL(){
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root, "root node: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "left node: "+node.getValue()+" :");
        display(node.right, "right node: "+node.getValue()+" :");
    }
    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node==null){
            return new Node(value);
        }
        if(node.value<value){
            node.right=insert(node.right,value);
        }
        if(node.value>value){
            node.left=insert(node.left,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    public Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)>height(node.left.right)){
                //left-left heavy
                return rightRotate(node);
            }
            if(height(node.left.left)<height(node.left.right)){
                //left-right heavy
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.right)>height(node.right.left)){
                //right-right heavy
                return leftRotate(node);
            }
            if(height(node.right.right)<height(node.right.left)){
                //right-left heavy
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node leftRotate(Node p){
        Node c=p.right;
        Node t=c.left;
        c.left=p;
        p.right=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;
    }
    public Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);
        return c;
    }

    public boolean balanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);

    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(0,nums.length,nums);
    }
    private void populateSorted(int start,int end,int[] nums){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        this.insert(nums[mid]);
        populateSorted(0,mid,nums);
        populateSorted(mid+1,end,nums);
    }
    public static void main(String[] args) {
        AVL tree=new AVL();
        // tree.insert(5);
        // tree.insert(15);
        // tree.insert(75);
        // tree.insert(1);
        // tree.insert(2);
        // tree.display();

        // int[] ar={1,2,3,4,5};
        // tree.populate(ar);
        tree.insert(13);
        tree.insert(10);
        tree.insert(15);
        tree.insert(5);
        tree.insert(11);
        tree.insert(16);
        tree.insert(4);
        tree.insert(6);
        tree.insert(7);
        tree.display();
    }
}

