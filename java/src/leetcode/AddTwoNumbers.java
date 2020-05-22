package leetcode;

/**
 * Created by ggjjl1 on 9/18/15.
 */
public class AddTwoNumbers {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int flag = 0;
        ListNode l = new ListNode(0);
        ListNode p = l;
        if(l1 == null && l2 == null){
            return null;
        }

        while(l1 != null || l2 != null || flag == 1){
            int val = 0;
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            if(val1+val2+flag >= 10){
                val = val1+val2+flag-10;
                flag = 1;
            }else{
                val = val1+val2+flag;
                flag = 0;
            }
            l.next = new ListNode(val);
            l = l.next;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        return p.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode node = addTwoNumbers(l1, l2);
        System.out.println(node.val);
        System.out.println(node.next.val);
    }
}
