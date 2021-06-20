
/**
 * @Author: www.chuckfang.top
 * @Date: 2019/5/24 12:41
 */
public class Main {
    public static void main(String[] args) {
        ListNode listNode = ListNode.getListNode();
        ListNode.traverse(listNode);

        ListNode listNode1 = ListNode.reverseList2(listNode);
        ListNode.traverse(listNode1);
    }

}
