package com.lonton.leetcode.easy;

import com.lonton.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历 <p/>
 *
 * @author 张利红
 */
public class Q094BinaryTreeInOrderTraversal {
    /**
     * 中序遍历
     *
     * @param root 根节点
     * @return 返回存储对象
     */
    public List<Integer> inorderTraversal(TreeNode<Integer> root) {
        // 定义list集合，存储返回对象
        List<Integer> val = new ArrayList<>();
        if (root == null) {
            return val;
        }
        // 递归遍历数据
        inorder(root, val);
        return val;
    }

    /**
     * 递归遍历下一个节点 （左->根->右）
     *
     * @param root 根节点 <br/>
     * @param val  list集合容器
     */
    public  void inorder(TreeNode<Integer> root, List<Integer> val) {
        // 判断是否有左节点
        if (root.getLeft() != null) {
            inorder(root.getLeft(), val);
        }
        // 判断当前左节点是否遍历完或者说是左节点根本不存在
        val.add( root.getVal());
        // 判断是否有右节点
        if (root.getRight() != null) {
            inorder(root.getRight(), val);
        }
    }

}
