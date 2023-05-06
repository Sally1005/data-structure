package com.lonton.binarytree;


import com.lonton.binarytree.pojo.BinaryTree;

/**
 * 二叉树访问数据接口
 *
 * @author 张利红
 */
public interface IVisitor {

    /**
     * 访问树
     *
     * @param node  节点
     * @param param 可变参数
     * @return 任意类型
     */
    Object visit(BinaryTree.TreeNode node, Object... param);

    /**
     * 查找节点
     *
     * @return 已查找到的节点
     */
    BinaryTree.TreeNode getFoundNode();
}

