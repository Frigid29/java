//link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

public class PreIn {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        int index[]={0};
        return makeTree(preorder, inorder, map, 0, preorder.length-1,index);
    }

    public TreeNode makeTree(int[] preorder, int[] inorder, Map<Integer, Integer> map, int left, int right, int[] index){
        if(left>right){
            return null;
        }
        int current= preorder[index[0]];
        index[0]++;
        TreeNode node= new TreeNode(current);
        int inorderIndex = map.get(current);
        if(left==right){
            return node;
        }
        node.left = makeTree(preorder, inorder, map, left, inorderIndex -1, index);
        node.right = makeTree(preorder, inorder, map, inorderIndex+1, right, index);

        return node;
    }
}
