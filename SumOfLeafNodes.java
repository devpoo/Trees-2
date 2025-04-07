package week3;

public class SumOfLeafNodes {

    class TreeNode {
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

    int sum = 0;
    public int sumOfLeafNodes(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode root, int currNum) {
        if(root == null) {
            return;
        }
        currNum = currNum * 10 + root.val;
        if(root.left == null && root.right==null) {
            sum += currNum;
        }
        helper(root.left, currNum);
        helper(root.right, currNum);
    }
}
