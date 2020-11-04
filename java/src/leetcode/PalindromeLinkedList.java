package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		int length = 0;
		ListNode p = head;
		while (p != null) {
			length = length + 1;
			p = p.next;
		}

		List<ListNode> list = new ArrayList<>();

		boolean isOdd = length % 2 == 1 ? true : false;
		int i = 0;
		while (head != null) {
			i = i + 1;
			if (i < length / 2 + length % 2) {
				list.add(head);
			}
			if (length / 2 + length % 2 == i) {
				if (isOdd == false) {
					list.add(head);
				}
			}
			if (i > length / 2 + length % 2) {
				if (head.val == list.get(list.size() - 1).val) {
					list.remove(list.size() - 1);
				} else {
					return false;
				}
			}
			head = head.next;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
