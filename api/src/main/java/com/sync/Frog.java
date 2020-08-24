package com.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frog {

	public static void main(String[] x) {
		Frog c = new Frog();
		System.out.println(c.solution(new int[] {2, 6, 8, 5}));
		System.out.println(c.solution(new int[] {1, 5, 5, 2, 6}));
		System.out.println(c.solution(new int[] {1, 1}));
		System.out.println(c.solution(new int[] {5, 7, 8, 8, 8, 5, 7, 10}));
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