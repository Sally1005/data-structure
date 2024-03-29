package com.lonton.binarytree.impl;

import com.lonton.binarytree.AVisitor;
import com.lonton.binarytree.pojo.BinaryTree;
import lombok.extern.slf4j.Slf4j;


/**
 * 计算树高
 *
 * @author 张利红
 */
@Slf4j
public class CountHeightVisitor<T> extends AVisitor<T> {
    // 初始高度
    private int height;

    /**
     * 计算树高
     *
     * @param node  节点
     * @param param 求高visitor
     * @return 树高
     */

    @Override
    public Object doVisit(BinaryTree.TreeNode<T> node, Object... param) {
            if ( node.getLevel() > height) {
                this.height = node.getLevel();
            }
            return node;
        }

    /**
     * 获取树高
     *
     * @return 树高
     */
    public int getHeight() {
        return height;
    }

    @Override
    public BinaryTree.TreeNode<T> getFoundNode() {
        return null;
    }
}
