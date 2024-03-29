package com.lonton.leetcode.med;

import com.lonton.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 098. 测试验证二叉搜索树 <p/>
 * <ol>
 * <li> 将数组 nums = [5,1,4,null,null,3,6] 构建成二叉树，验证是否为二叉搜索树,并判断输出的值是否为预期的 false。
 * <li> 将数组 nums2 = [2,1,3] 构建成二叉树，验证是否为二叉搜索树,并判断输出的值是否为预期的 true。
 * </ol>
 *
 * @author 张利红
 */
public class Q098ValidateBinarySearchTreeTest {

    @Test
    public void testFalse() {
        // 构建二叉树
        Integer[] nums = new Integer[]{5, 1, 4, null, null, 3, 6};
        TreeNode<Integer> root = TreeNode.arrayToTree(nums);

        Assertions.assertFalse(new Q098ValidateBinarySearchTree().isValidBST(root), "比对失败，验证二叉搜索树错误。");
    }

    @Test
    public void testTrue() {
        // 构建二叉树
        Integer[] nums2 = new Integer[]{2, 1, 3};
        TreeNode<Integer> root2 = TreeNode.arrayToTree(nums2);

        Assertions.assertTrue(new Q098ValidateBinarySearchTree().isValidBST(root2), "比对失败，验证二叉搜索树错误。");
    }
}
