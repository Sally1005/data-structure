package com.lonton.leetcode.easy;


import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * @author 张利红
 */
public class Q144BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        // 定义list集合，存储返回对象
        List<Integer> vals = new ArrayList<>();
        if(root == null){
            return vals;
        }
        // 递归遍历数据
        preorder(root, vals);
        return vals;
    }


    /**
     * 递归遍历下一个节点 <br/>
     * 根->左->右 <br/>
     * @param root 根节点 <br/>
     * @param vals list集合容器
     */
    public static void preorder(TreeNode root, List<Integer> vals) {
        if(root == null){
            return;
        }
         // 判断根节点存在
        vals.add(root.val);
         // 判断是否有左节点
        if (root.left != null) {
            preorder(root.left, vals);
        }
         // 判断是否有右节点
        if (root.right != null) {
            preorder(root.right, vals);
        }
    }


    /**
     * 定义二叉树 （题目给出条件）<br/>
     * 提示：<br/>
     * <br/>
     * 树中节点数目在范围 [0, 100] 内<br/>
     * -100 <= Node.val <= 100
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
