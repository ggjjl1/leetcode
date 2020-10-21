package leetcode;

public class LongPressedName {

	// 设置静态常量
	public static final boolean TRUE = true;
	public static final boolean FALSE = false;

	public static boolean isLongPressedName(String name, String typed) {

		// 声明两个指针变量，用作 name 和 typed 下标
		int i = 0;
		int j = 0;

		for (i = 0; i < name.length(); i++) {

			if (j >= typed.length())
				return false;

			if (typed.charAt(j) == name.charAt(i)) {
				
				j = j + 1;
			} else {

				if (name.charAt(i) != typed.charAt(j)) {

					if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
						return false;
					}

					while (j < typed.length() && typed.charAt(j - 1) == typed.charAt(j)) {
						j = j + 1;
					}

					if (j < typed.length() && typed.charAt(j) == name.charAt(i)) {
						j = j + 1;
						continue;
					} else {
						return false;
					}

				}
			}
		}
		
		while(j < typed.length()) {
			if(typed.charAt(j) != typed.charAt(j - 1)) return false;
			j = j + 1;
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = "pyplrz";
//		String typed = "ppyypllr";
		
		String name = "alex";
		String typed = "alexxr";

		System.out.println(isLongPressedName(name, typed));

	}

}
