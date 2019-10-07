package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}

		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static Double findTallest(List<Double> peeps) {
		int tallestIndex = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > peeps.get(tallestIndex)) {
				tallestIndex = i;
			}
		}

		return peeps.get(tallestIndex);
	}

	public static String findLongestWord(List<String> words) {
		int longestIndex = 0;
		String word;
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).length() > words.get(longestIndex).length()) {
				longestIndex = i;
			}
		}
		return words.get(longestIndex);
	}

	public static boolean containsSOS(List<String> morse) {
		for (int i = 0; i < morse.size(); i++) {
			if (morse.get(i).contains("... --- ...") == true) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {

		boolean sorted = false;
		int counter = 0;
		while (sorted == false) {
			counter = 0;
			for (int i = 0; i < results.size(); i++) {
				if (i != results.size() - 1) {
					if (results.get(i) > results.get(i + 1)) {
						Double num = results.get(i);
						Double num2 = results.get(i + 1);
						results.set(i, num2);
						results.set(i + 1, num);
						counter = counter + 1;
					}
				}
			}
			if (counter == 0) {
				sorted = true;
				break;
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> sequences) {
		boolean sorted = false;
		int counter = 0;
		while (sorted == false) {
			counter = 0;
			for (int i = 0; i < sequences.size(); i++) {
				if (i != sequences.size() - 1) {
					if (sequences.get(i).length() > sequences.get(i + 1).length()) {
						String sequence1 = sequences.get(i);
						String sequence2 = sequences.get(i + 1);
						sequences.set(i, sequence2);
						sequences.set(i + 1, sequence1);
						counter++;
					}
				}
			}
			if (counter == 0) {
				sorted = true;
				break;
			}
		}
		return sequences;
	}
	
	public static List<String> sortWords(List<String> words) {
//		boolean sorted = false;
//		int counter = 0;
//		while(sorted == false) {
//			counter = 0;
//		}
		
		System.out.println("A".compareTo("D"));
		
		return words;
	}

}
