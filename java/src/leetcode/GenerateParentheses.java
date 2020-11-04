package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		generateValidParenthesis(n * 2, new StringBuilder(), result);

		return result;
	}

	public void generateValidParenthesis(int n, StringBuilder sb, List<String> result) {
		if (n == 0) {
			if (isValid(sb.toString())) {
				result.add(sb.toString());
			}
			return;
		}
		generateValidParenthesis(n - 1, sb.append("("), result);
		sb.deleteCharAt(sb.length() - 1);
		generateValidParenthesis(n - 1, sb.append(")"), result);
		sb.deleteCharAt(sb.length() - 1);
	}

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
		GenerateParentheses generateParentheses = new GenerateParentheses();
		List<String> rs = generateParentheses.generateParenthesis(3);
		System.out.println(rs.toString());
	}

}
