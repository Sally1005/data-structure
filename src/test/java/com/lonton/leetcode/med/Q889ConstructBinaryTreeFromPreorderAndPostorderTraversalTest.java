package com.lonton.leetcode.med;

import com.lonton.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * 889. 测试根据前序和后序遍历构造二叉树
 * <ol>
 * <li> 将数组 preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1] 构建成二叉树，并判断输出的值是否为预期的[1,2,3,4,5,6,7]。
 * <li> 将数组 preorder2 = [], postorder2 = [] 构建成二叉树，并判断输出的值是否为预期的[null]。
 * </ol>
 *
 * @author 张利红
 */
public class Q889ConstructBinaryTreeFromPreorderAndPostorderTraversalTest {

    @Test
    public void test() {

        TreeNode tree = new Q889ConstructBinaryTreeFromPreorderAndPostorderTraversal().buildTree(
                new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});
        Object[] objects = new TreeNode().treeToArray(tree);
        Integer[] array = new Integer[objects.length];
        for(int i = 0;i<objects.length;i++) {
            array[i] = (Integer)objects[i];
        }

        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, array,
                "比对失败，前序数组和后序数组构成的二叉搜索树与与实际预期不相等。");
    }

    @Test
    public void testEmpty() {

        TreeNode tree2 = new Q889ConstructBinaryTreeFromPreorderAndPostorderTraversal().buildTree(
                new int[0], new int[0]);
        Integer[] array = (Integer[]) new TreeNode().treeToArray(tree2);
        Assertions.assertArrayEquals(null, array,
                "比对失败，前序数组和后序数组构成的二叉搜索树与与实际预期不相等。");
    }
}


