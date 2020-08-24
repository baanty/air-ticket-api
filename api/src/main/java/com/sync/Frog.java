package com.sync;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Frog {

	public static void main(String[] x) {
		Frog c = new Frog();
		System.out.println(c.solution(new int[] {2, 6, 8, 5}));
		System.out.println(c.solution(new int[] {1, 5, 5, 2, 6}));
		System.out.println(c.solution(new int[] {1, 1}));
		System.out.println(c.solution(new int[] {5, 7, 8, 8, 8, 5, 7, 10}));
		System.out.println(c.solution(new int[] {1, 0}));
		
		
		
		int arrayLength = 9999999;
		int[] loadedArray = new int[arrayLength]; 
	
		for ( int index = 0 ; index < arrayLength ; index ++ ) {
			
			Random randomInt = new Random();
			int element = randomInt.nextInt();
			element = element > 0 ? element : ( element * -1 );
			loadedArray[index] = element;
		}
		LocalDateTime ldtStart = LocalDateTime.now();
		System.out.println(c.solution(loadedArray));
		//Thread.sleep(2000);
		LocalDateTime ldtEnd = LocalDateTime.now();
		System.out.println("Execution Time in seconds - " + ldtStart.until(ldtEnd, ChronoUnit.MILLIS));
	}
	
	
	public int solution(int[] blocks) {
		int longestDistance = 0;
		
		for ( int index = 0 ;  index < blocks.length ; index ++) {
			int distance = 1;
			
			for ( int leftProgressionIndex = index ; leftProgressionIndex > 0 ; leftProgressionIndex-- ) {
				
				if ( blocks[leftProgressionIndex - 1] >= blocks[leftProgressionIndex] ) {
					distance++;
				} else {
					break;
				}
			}

			for ( int rightProgressionIndex = index ; rightProgressionIndex < blocks.length - 1 ; rightProgressionIndex++ ) {
				
				if ( blocks[rightProgressionIndex + 1] >= blocks[rightProgressionIndex] ) {
					distance++;
				} else {
					break;
				}
			}
			longestDistance = longestDistance > distance ? longestDistance : distance;
		}
		return longestDistance;
	}
	
}