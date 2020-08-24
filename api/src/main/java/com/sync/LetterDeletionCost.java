package com.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterDeletionCost {

	public static void main(String[] x) {
		LetterDeletionCost c = new LetterDeletionCost();
		System.out.println(c.solution("aaaa", new int[] { 3, 4, 5, 6 }));
		System.out.println(c.solution("abccbd", new int[] { 0, 1, 2, 3, 4, 5 }));
		System.out.println(c.solution("aabbcc", new int[] { 1, 2, 1, 2, 1, 2 }));
		System.out.println(c.solution("ababa", new int[] { 10, 5, 10, 5, 10 }));
		System.out.println(c.solution("zzwzz", new int[] { 5, 4, 3, 2, 1 }));
	}

	public int solution(String S, int[] C) {

		if (S == null || S.length() == 1 || S.length() == 0) {
			return 0;
		}
		int accumulatedMinCost = 0;

		for (int index = 0; index < S.length() - 1; index++) {
			char ch = S.charAt(index);

			if (S.charAt(index + 1) == ch) {
				int firstCharacterRemovalCost = C[index];
				int secondCharacterRemovalCost = C[index + 1];
				accumulatedMinCost = accumulatedMinCost + (firstCharacterRemovalCost > secondCharacterRemovalCost ? secondCharacterRemovalCost
						: firstCharacterRemovalCost);
			}
		}
		return accumulatedMinCost;
	}

}
