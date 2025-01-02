//link: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

import java.util.*;

public class VerticalOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        if(root==null){
            return ans;
        }
        int col = 0;
        Queue<HashMap.Entry<TreeNode, Integer>> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map= new HashMap<>();
        q.offer(new HashMap.SimpleEntry<>(root,col));
        int max=col, min=col;
        while(!q.isEmpty()){
            HashMap.Entry<TreeNode, Integer> removed = q.poll();
            root = removed.getKey();
            col= removed.getValue();
            if(root!= null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<>());
                }
                map.get(col).add(root.val);
                min = Math.min(min,col);
                max = Math.max(max,col);
                q.offer(new HashMap.SimpleEntry(root.left,col-1));
                q.offer(new HashMap.SimpleEntry(root.right,col+1));
            }
        }
        for(int i = min; i <= max; i++){
            ans.add(map.get(i));
        }
        return ans;
    }
    TreeNode root;
    public void populate(){
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
    }
    public static void main(String[] args) {
        VerticalOrderTraversal v = new VerticalOrderTraversal();
        v.populate();
        List<List<Integer>> result = v.verticalTraversal(v.root);
        System.out.println(result);
    }
}
