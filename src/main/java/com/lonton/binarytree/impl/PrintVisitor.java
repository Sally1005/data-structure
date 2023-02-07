package com.lonton.binarytree.impl;

import com.lonton.binarytree.ITraverser;
import com.lonton.binarytree.pojo.BinaryTree;
import com.lonton.binarytree.IVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 打印
 * <p/>
 * @author 张利红
 */
public class PrintVisitor implements IVisitor, ITraverser {
    /**
     * 树中数据集合
     */
    private List<String> res = new ArrayList<>();

    /**
     * 打印二叉树
     * @param node 根节点
     * @param param 任意类型
     * @return 树中数据
     */
    @Override
    public Object visit(BinaryTree.TreeNode node, Object... param) {
        res.add(node.getData());
        return node;
    }

    @Override
    public Object visit(BinaryTree.TreeNode node, Predicate<BinaryTree.TreeNode> predicate) {
        return null;
    }

    @Override
    public BinaryTree.TreeNode getFoundNode() {
        return null;
    }

    @Override
    public Predicate<BinaryTree.TreeNode> predicate() {
        return IVisitor.super.predicate();
    }

    /**
     * 获取树中数据
     * @return 树中数据
     */
    public List<String> getRes() {
        return res;
    }

    @Override
    public Object traverse(BinaryTree tree, IVisitor visitor, Object... param) {
        return null;
    }

    @Override
    public Object doVisitor(BinaryTree binaryTree, IVisitor visitor, Object... param) {
        return ITraverser.super.doVisitor(binaryTree, visitor, param);
    }
}
