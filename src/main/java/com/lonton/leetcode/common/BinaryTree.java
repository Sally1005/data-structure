package com.lonton.leetcode.common;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树类
 *
 * @author 张利红
 */
public class BinaryTree {
    /**
     * 根节点
     */
    private TreeNode root;

    /**
     * 数组转为树
     *
     * @param array int数组
     * @return treeNode
     */
    public static TreeNode arrayToTree(Integer[] array) {
        // 构建一棵二叉树
        BinaryTree tree = new BinaryTree();
        // 如果数组为空，则返回空数组
        if (array.length == 0) return null;
        // 数组第一个为根节点
        tree.root = new TreeNode(array[0]);
        // 初始化树的下标
        int treeIdx = 0;
        int dataIdx = 0;
        // 创建一个集合存放数组
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(tree.root);
        // 循环遍历数组
        for (dataIdx = 1; dataIdx < array.length; dataIdx += 2) {
            // 放置左节点
            if (array[dataIdx] != null) {
                TreeNode left = new TreeNode(array[dataIdx]);
                // 挂树
                treeNodes.get(treeIdx).setLeft(left);
                // 加到集合中
                treeNodes.add(left);
            }
            // 放置右节点
            if (dataIdx + 1 < array.length && array[dataIdx + 1] != null) {
                TreeNode right = new TreeNode(array[dataIdx + 1]);
                treeNodes.get(treeIdx).setRight(right);
                treeNodes.add(right);
            }
            treeIdx++;
        }
        return tree.root;

    }

    /**
     * 树转为数组
     *
     * @param root 根节点
     * @return 数组
     */
    public static Integer[] treeToArray(TreeNode root) {
        // 根节点为空，返回一个空数组
        if (root == null) return new Integer[0];
        // 由于不知道数组长度，先将元素存入list中
        List<Integer> list = new ArrayList<>();
        // 创建队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 加入根节点
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null)
                    list.add(node.val);
                else
                    list.add(null);
                if (node == null || (queue.isEmpty() && node.left == null && node.right == null))
                    continue;
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return list.toArray(new Integer[0]);
    }

}