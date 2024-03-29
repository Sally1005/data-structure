package com.lonton.leetcode.easy;

import com.lonton.leetcode.common.TreeNode;


/**
 * 226. 翻转二叉树 <p/>
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。<p/>
 * 思路：<p/>
 * 在遍历过程中将左右节点位置的值进行交换，类似于冒泡排序。
 *
 * @author 张利红
 */
public class Q226InvertBinaryTree {
    /**
     * 翻转二叉树
     *
     * @param root 根节点
     */
    public void invertTree(TreeNode<Integer> root) {
        if (root != null) {
            swap(root);
            invertTree(root.getLeft());
            invertTree(root.getRight());
        }
    }

    /**
     * 节点交换
     *
     * @param root 根节点
     */
    private void swap(TreeNode<Integer>  root) {
        // 临时存储左(右)节点值
        TreeNode<Integer>  temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
    }
}
