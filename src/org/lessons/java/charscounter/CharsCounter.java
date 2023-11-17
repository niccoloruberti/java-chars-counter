package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CharsCounter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		
		String word = in.nextLine();
		
		in.close();
		
		Map<Character, Integer> charsCounter = new HashMap<>();
		
		for ( Character c : word.toLowerCase().toCharArray()) {
			
			if (charsCounter.containsKey(c)) {
				
				charsCounter.put(c, charsCounter.get(c) + 1);
			} else {
				
				charsCounter.put(c , 1);
			}
		}
		
		Iterator<Character> itr = charsCounter.keySet().iterator();
		
		while (itr.hasNext()) {
			
			Character c = itr.next();
			Integer value = charsCounter.get(c);
			
			System.out.println(c + " : " + value);
			
		}

	}

}
