public class Segments_Trees {
     private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        public Node(int start, int end){
            this.startInterval = start;
            this.endInterval = end;
        }
     }
     Node root;
     private Segments_Trees(int[] ar){
        root = buildTree(ar, 0, ar.length - 1);
     }

     private Node buildTree(int[] ar, int st, int end){
        if(st == end){
            Node leaf = new Node(st,end);
            leaf.data = ar[st];
            return leaf;
        }
        Node node= new Node(st,end);
        int mid = (st + end) / 2;
        node.left=buildTree(ar,st,mid);
        node.right=buildTree(ar,mid+1,end);
        node.data=node.left.data + node.right.data;
        return node;
     }
     public void display(){
        display(root);
     }
     private void display(Node node){
        String str="";
        //left node
        if(node.left != null){
            str=str+"Interval= ["+node.left.startInterval+","+node.left.endInterval+"] and data: "+node.left.data+" =>";
        }else{
            str=str+"No left node =>";
        }
        //node 
        str=str+"Interval= ["+node.startInterval+","+node.endInterval+"] and data: "+node.data;

        //right node
        if(node.right != null){
            str=str+" <= Interval= ["+node.right.startInterval+","+node.right.endInterval+"] and data: "+node.right.data;
        }else{
            str=str+" <= No right node.";
        }

        System.out.println(str+"\n");

        //recursion
        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }

     }

     public int query(int qsi, int qei){
        return query(root,qsi,qei);
     }
     private int query(Node node, int qsi, int qei){
        if(qsi<=node.startInterval && qei>=node.endInterval){
            //node is completely inside the query
            return node.data;
        }else if(qsi> node.endInterval || qei< node.startInterval){
            //node is outside the query
            return 0;
        }else{
            //node is overlapping with the query
            int left=query(node.left,qsi,qei);
            int right=query(node.right,qsi,qei);
            return left+right;
        }
     }

     public void update(int index, int value){
        this.root.data=update(root, index, value);
     }
     private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<= node.endInterval){
            //index is in the array
            if(index==node.startInterval && index==node.endInterval){
                //to reach the leaf node 
                node.data=value;
            }else{
                int left=update(node.left,index,value);
                int right=update(node.right,index,value);

                node.data=left+right;
                return node.data;
            }
        }
        return node.data;
     }

     public static void main(String[] args) {
        int ar[]= {3,8,7,6,-2,-8,4,9};
        Segments_Trees st=new Segments_Trees(ar);
        // st.display();
        // System.out.println(st.query(1,6));
        st.update(3,14);
        st.display();
     }
}
