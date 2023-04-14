package com.lonton.leetcode.med;

import com.lonton.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 701. 插入二叉搜索树
 * <ul>
 * <li> 将数组 [4,2,7,1,3],构建成二叉搜索树,val = 5(val为插入值)并判断是否符合预期输出[4,2,7,1,3,5]。
 * </ul>
 *
 * @author 张利红
 */
public class Q701InsertNodeInBSTTest {
    @Test
    public void test() {
        TreeNode root = new TreeNode<>().arrayToTree(new Integer[]{4, 2, 7, 1, 3});
        TreeNode tree = new Q701InsertNodeInBST().insertIntoBST(root, 5);

        Assertions.assertArrayEquals(new Integer[]{4, 2, 7, 1, 3, 5}, tree.treeToArray(tree, Integer.class),
                "比对失败，前序数组和后序数组构成的二叉搜索树与与实际预期不相等。");
    }

}
