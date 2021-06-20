public class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
    }

    /**
     * 创建一个单链表
     * @return
     */
    public static ListNode getListNode() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        return listNode1;
    }

    /**
     * 遍历单链表
     * @param listNode
     */
    public static void traverse(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.value);
            listNode = listNode.next;
        }
    }

    /**
     * 迭代的方法反转单链表
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;

            curr = temp;

        }
        return prev;
    }

    /**
     * 递归的方法反转单链表
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
