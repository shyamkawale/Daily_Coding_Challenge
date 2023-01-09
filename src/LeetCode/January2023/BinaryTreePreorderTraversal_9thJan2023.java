package LeetCode.January2023;

import Utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_9thJan2023 {
    public static void main(String[] args) {
        String line = "[1, 2, 3]";
        TreeNode root = TreeNode.stringToTreeNode(line);
        TreeNode.prettyPrintTree(root);
        System.out.println(binaryTreePreorderTraversal(root));
    }
    private static List<Integer> res = new ArrayList<>();
    private static List<Integer> binaryTreePreorderTraversal(TreeNode root) {
        if(root == null)return res;
        res.add(root.val);
        binaryTreePreorderTraversal(root.left);
        binaryTreePreorderTraversal(root.right);
        return res;
    }
}
