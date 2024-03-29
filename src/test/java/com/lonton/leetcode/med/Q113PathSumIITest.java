package com.lonton.leetcode.med;


import com.lonton.leetcode.common.TreeNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 113. 测试路径总和：找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * <ul>
 * <li> 将数组  [5,4,8,11,null,13,4,7,2,null,null,5,1],构建成二叉树,并判断该树中是否存在 根节点到叶子节点 的路径 和为 t1 = 22
 *    与预期结果[[5,4,11,2]]进行对比
 * </ul>
 *
 * @author 张利红
 */
@Slf4j
public class Q113PathSumIITest {
    @Test
    public void test() {
        // 构建二叉树
        Integer[] nums = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode<Integer> root = TreeNode.arrayToTree(nums);

        List<List<Integer>> actual = new  Q113PathSumII().pathSum(root, 22);
        List<List<Integer>> expected = new ArrayList<>(
                Collections.singletonList(Arrays.asList(5, 4, 11, 2)));

        // 断言
        Assertions.assertEquals(expected, actual,
                " 符合条件的路径总和不存在。");
    }
}

