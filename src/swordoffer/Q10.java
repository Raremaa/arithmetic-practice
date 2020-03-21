package swordoffer;

/**
 * @author masaiqi.com
 * @date 2020/3/21
 */
class Q10 {
	
	/**
	 * 输入一个链表，反转链表后，输出新链表的表头
	 */
	
	public static void main(String[] args) {
		
		
	}


    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     */
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode preNode = null;
        while(head != null) {
            ListNode nextNode = head.next;
            if(nextNode == null) {
                newHead = head;
            }
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return newHead;
    }


	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}