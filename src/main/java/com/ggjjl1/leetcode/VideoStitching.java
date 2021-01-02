package com.ggjjl1.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoStitching {

	public int videoStitching(int[][] clips, int T) {
		int[] used = new int[clips.length];
		
		List<int[]> result = new ArrayList<>();
		int[] range = new int[] { 0, 0 };
		boolean flag = false;
		while (result.size() == 0 || result.get(result.size() - 1)[1] < T) {
			for (int i = 0; i < clips.length; i++) {
				
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] clips = { { 0, 2 }, { 4, 6 }, { 8, 10 }, { 1, 9 }, { 1, 5 }, { 5, 9 } };
		int T = 10;
		
		int[] used = new int[10];
		for(int i = 0;i< Arrays.asList(used).size();i++) {
			Arrays.asList(used).get(i);
		}
	}

}
