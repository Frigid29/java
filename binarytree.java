import java.util.*;
class binarytree{

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

    public binarytree(){
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
        return node;
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
        binarytree tree=new binarytree();
        // tree.insert(5);
        // tree.insert(15);
        // tree.insert(75);
        // tree.insert(1);
        // tree.insert(2);
        // tree.display();

        int[] ar={1,2,3,4,5};
        tree.populateSorted(ar);
        tree.display();
    }
}

