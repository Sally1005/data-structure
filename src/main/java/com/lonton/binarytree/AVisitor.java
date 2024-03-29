package com.lonton.binarytree;

import com.lonton.binarytree.pojo.BinaryTree;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * 访问visitor 抽象类
 *
 * @author 张利红
 */

@Data
public abstract class AVisitor<T> implements IVisitor<T>{

    // 声明一个用于存储过滤器的列表
    private List<Predicate<BinaryTree.TreeNode<T>>> filters = new ArrayList<>();

    // 用于存储找到的树节点
    protected BinaryTree.TreeNode<T> foundNode;

    /**
     * 添加过滤器的方法
     *
     * @param filter   要添加到过滤器列表中的过滤器
     */
    public  void addFilter(Predicate<BinaryTree.TreeNode<T>> filter){
            this.filters.add(filter);
    }

    /**
     * 重写visit方法，实现过滤器功能（如果满足过滤器列表中所有谓词（过滤器）的条件，则调用抽象方法 doVisit ）
     *
     * @param node    要访问的节点
     * @param param   visitor可选的具体行为列表（包括求高、打印和求节点个数）
     * @return        抽象方法 doVisit 的返回结果或 null
     */
    @Override
    public Object visit(BinaryTree.TreeNode<T> node, Object... param) {
        if (filters != null && filters.stream().filter(Objects::nonNull).allMatch(filter -> filter.test(node))) {
            doVisit(node, param);
        }
        return null;
    }

    /**
     * 抽象方法，必须由子类实现，用于执行具体的访问操作
     *
     * @param node    要访问的节点
     * @param param   visitor可选的具体行为列表（包括求高、打印、查找节点和求节点个数）
     * @return        访问结果
     */
    public abstract Object doVisit(BinaryTree.TreeNode<T> node, Object... param);

    /**
     * 获取在访问期间找到的节点
     *
     * @return    在访问期间找到的节点
     */
    @Override
    public BinaryTree.TreeNode<T> getFoundNode() {
        return foundNode;
    }
}
