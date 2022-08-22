import leetcode876.LeetCode876;
import leetcode876.ListNode;

public class Main {
    public static void main(String[] args) {
//        LeetCode383 leetCode383 = new LeetCode383();
//        LeetCode412 leetCode412 = new LeetCode412();
//        LeetCode1480 leetCode1480 = new LeetCode1480();
        LeetCode876 leetCode876 = new LeetCode876();

        ListNode node4 = new ListNode(24, null);
        ListNode node3 = new ListNode(15, node4);
        ListNode node2 = new ListNode(22, node3);
        ListNode node1 = new ListNode(78, node2);

        ListNode head = new ListNode(0, node1);

        ListNode result = leetCode876.middleNode(head);
//        int result = leetCode876.countNode(head);

        System.out.println(result.getVal());
//        System.out.println(result);
    }
}
