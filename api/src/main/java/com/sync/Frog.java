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
	}
	
	
	public int solution(int[] blocks) {
		List<Integer> options = new ArrayList<Integer>();
		
		for ( int i = 0 ;  i < blocks.length ; i ++) {
			int distance = 1;
			
			for ( int leftProgressionIndex = i ; leftProgressionIndex > 0 ; leftProgressionIndex-- ) {
				
				if ( blocks[leftProgressionIndex - 1] >= blocks[leftProgressionIndex] ) {
					distance++;
				}
			}

			for ( int rightProgressionIndex = i ; rightProgressionIndex < blocks.length - 1 ; rightProgressionIndex++ ) {
				
				if ( blocks[rightProgressionIndex + 1] >= blocks[rightProgressionIndex] ) {
					distance++;
				}
			}
			options.add(distance);
		}
		Collections.sort(options, Collections.reverseOrder());
		return options.get(0);
	}
	
}