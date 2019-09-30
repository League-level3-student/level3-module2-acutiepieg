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
		int count  = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}
	
	public static Double findTallest(List<Double> peeps) {
		int tallestIndex = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > peeps.get(tallestIndex)) {
				tallestIndex = i;
			}
		}
		
		return peeps.get(tallestIndex);
	}

}
