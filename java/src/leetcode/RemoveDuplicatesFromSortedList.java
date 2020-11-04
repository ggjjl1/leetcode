package leetcode;

public class RemoveDuplicatesFromSortedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {

		ListNode prevNode = null;
		ListNode curNode = head;

		while (curNode != null) {
			if (prevNode != null) {
				if (prevNode.val == curNode.val) {
					curNode = curNode.next;
					prevNode.next = curNode;
				} else {
					prevNode = curNode;
					curNode = curNode.next;
				}
			} else {
				prevNode = curNode;
				curNode = curNode.next;
			}
		}

		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
