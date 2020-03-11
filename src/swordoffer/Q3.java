package swordoffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author masaiqi
 * @date 2020/3/11 8:44 下午
 */
public class Q3 {


    /**
     *
     输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     */


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        return doJob(listNode);
    }



    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     */
    private static ArrayList<Integer> doJob(ListNode listNode) {
        if(listNode == null) {
            return new ArrayList<Integer>(0);
        }
        if(listNode.next == null) {
            ArrayList<Integer> list = new ArrayList<>(0);
            list.add(listNode.val);
            return list;
        }else {
            ArrayList<Integer> list = doJob(listNode.next);
            list.add(listNode.val);
            return list;
        }
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


}
