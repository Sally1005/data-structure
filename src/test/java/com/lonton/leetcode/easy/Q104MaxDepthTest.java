package com.lonton.leetcode.easy;

import com.lonton.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 104. 测试计算二叉树的最大深度
 * <ul>
 * <li> 将数组 nums = [3,9,20,null,null,15,7] 构建成二叉树,并校验二叉树最大深度是否为预期值3。
 * </ul>
 *
 * @author 张利红
 */
public class Q104MaxDepthTest {
    @Test
    public void test() {
        // 构建二叉树
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode<Integer>  root = TreeNode.arrayToTree(nums);

        Assertions.assertEquals(3, new Q104MaxDepth().maxDepth(root),
                "比对失败，最大深度计算错误错误。");
    }
}
