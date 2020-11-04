package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

	public boolean isValid(String s) {

		List<Character> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			boolean flag = false;
			
			if (list.size() > 0) {
				char tempChar = list.get(list.size() - 1);
				if (tempChar == '{' && s.charAt(i) == '}') {
					flag = true;
				}
				if (tempChar == '(' && s.charAt(i) == ')') {
					flag = true;
				}
				if (tempChar == '[' && s.charAt(i) == ']') {
					flag = true;
				}
			}

			if (flag) {
				list.remove(list.size() - 1);
			} else {
				list.add(s.charAt(i));
			}
		}

		return list.size() == 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()";

		ValidParentheses validParentheses = new ValidParentheses();
		System.out.println(validParentheses.isValid(s));
	}

}
