package com.sync;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class LetterDeletionCost {

	public static void main(String[] x) throws InterruptedException {
		LetterDeletionCost c = new LetterDeletionCost();
		System.out.println(c.solution("aaaa", new int[] { 3, 4, 5, 6 }));
		System.out.println(c.solution("abccbd", new int[] { 0, 1, 2, 3, 4, 5 }));
		System.out.println(c.solution("aabbcc", new int[] { 1, 2, 1, 2, 1, 2 }));
		System.out.println(c.solution("ababa", new int[] { 10, 5, 10, 5, 10 }));
		System.out.println(c.solution("zzwzz", new int[] { 5, 4, 3, 2, 1 }));
		
		int arrayLength = 9999999;
		int[] loadedArray = new int[arrayLength]; 
		StringBuilder inputString = new StringBuilder();
		
		for ( int index = 0 ; index < arrayLength ; index ++ ) {
			
			Random randomInt = new Random();
			char ch = (char)(randomInt.nextInt(26) + 'a');
			inputString.append(ch);
			int element = randomInt.nextInt();
			element = element > 0 ? element : ( element * -1 );
			loadedArray[index] = element;
		}
		String inputStr = inputString.toString();
		LocalDateTime ldtStart = LocalDateTime.now();
		System.out.println(c.solution(inputStr, loadedArray));
		//Thread.sleep(2000);
		LocalDateTime ldtEnd = LocalDateTime.now();
		System.out.println("Execution Time in seconds - " + ldtStart.until(ldtEnd, ChronoUnit.MILLIS));
	}

	public int solution(String inputString, int[] charRemovalCosts) {

		if (inputString == null || inputString.length() == 1 || inputString.length() == 0) {
			return 0;
		}
		
		if ( charRemovalCosts == null || charRemovalCosts.length != inputString.length() ) {
			throw new RuntimeException("The character removal cost array is malformed.");
		}
		int accumulatedMinCost = 0;
		
		for ( int index = 0; index < inputString.length() - 1; index++ ) {

			if ( inputString.charAt(index) == inputString.charAt(index + 1) ) {
				int firstCharacterRemovalCost = charRemovalCosts[index];
				int secondCharacterRemovalCost = charRemovalCosts[index + 1];
				accumulatedMinCost = accumulatedMinCost + (firstCharacterRemovalCost > secondCharacterRemovalCost ? secondCharacterRemovalCost
						: firstCharacterRemovalCost);
			}
		}
		return accumulatedMinCost;
	}

}
