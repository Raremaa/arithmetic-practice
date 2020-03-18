/**
 * @author masaiqi.com
 * @date 2020/3/18
 */
class Q9 {

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     */


    public static void main(String[] args) {

    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        //输出倒数第k个，即输出正数第size - k + 1 个
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            if (k == 1) {
                return head;
            } else {
                return null;
            }
        }
        int size = 1;
        ListNode temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        if (size < k) {
            return null;
        } else {
            for (int i = 1; i < size - k + 1; i++) {
                head = head.next;
            }
            return head;
        }


    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}