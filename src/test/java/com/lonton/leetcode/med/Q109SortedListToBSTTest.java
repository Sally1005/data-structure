package com.lonton.leetcode.med;


import com.lonton.leetcode.common.ListNode;
import com.lonton.leetcode.common.TreeNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * 109.  测试 将有序链表转换为二叉搜索树
 * <ol>
 * <li> 输入： head = [-10,-3,0,5,9],判断翻转后二叉树节点是否符合预期 result1= [0,-3,9,-10,null,5]。
 * <li> 输入：head2 = [],(链表为空)，判断翻转后二叉树节点是否符合预期 result2=[null]。
 * </ol>
 *
 * @author 张利红
 */
public class Q109SortedListToBSTTest {

    @Test
    public void test() {
        // 构建链表
        ListNode<Integer> head = ListNode.arrayToList(new Integer[]{-10, -3, 0, 5, 9});
        TreeNode<Integer> tree1 = new Q109SortedListToBST().sortedListToBST(head);
        Integer[] array =  TreeNode.treeToArray(tree1);

        // 断言
        Assertions.assertArrayEquals(new Integer[]{0, -3, 9, -10, null, 5}, array,
                "由有序链表构建的二叉搜索树的节点与预期不相等");
    }

    @Test
    public void testEmpty() {
        // 构建链表
        ListNode<Integer> head2 = ListNode.arrayToList(new Integer[0]);
        TreeNode<Integer> tree2 = new Q109SortedListToBST().sortedListToBST(head2);

        // 断言
        Assertions.assertNull(tree2, "由有序链表构建的二叉搜索树的节点与预期不相等");

    }
}



