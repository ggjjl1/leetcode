package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels {
	public List<Integer> partitionLabels(String S) {
		List<Integer> result = new ArrayList<>();
		List<Character> charList = new ArrayList<>();

		for (int i = 0; i < S.length(); i++) {
			char tempChar = S.charAt(i);
			if (i == 0) {
				charList.add(tempChar);
				continue;
			}

			boolean flag = false;
			for (int j = 0; j < charList.size(); j++) {
				if (S.substring(i, S.length()).contains(String.valueOf(charList.get(j)))) {
					flag = true;
					charList.add(tempChar);
					break;
				}
			}
			if (flag == false) {
				
				result.add(charList.size());
				charList.clear();
				charList.add(tempChar);
			}
		}
		
		if(charList.size() > 0) {
			result.add(charList.size());
		}

		return result;
	}

	public char[] copyToNewArray(char[] inputArray) {
		char[] tempArray = new char[inputArray.length + 1];
		for (int i = 0; i < inputArray.length; i++) {
			tempArray[i] = inputArray[i];
		}
		return tempArray;
	}

	public static void main(String[] args) {
		PartitionLabels pl = new PartitionLabels();
		List<Integer> myList = pl.partitionLabels("ababcbacadefegdehijhklij");
		System.out.println(Arrays.toString(myList.toArray()));
	}
}
