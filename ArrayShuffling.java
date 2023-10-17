package question1;

import java.util.*;

public class ArrayShuffling {

	public static void main(String[] args) {
		//creating array with given values
		Integer a[]= {1,2,3,4,5,6,7};
		
		//converting array to ArrayList for shuffling
		ArrayList<Integer> arrayLlist=new ArrayList<>(Arrays.asList(a));
		
		//shuffle the arrayList
		Collections.shuffle(arrayLlist);
		Integer shuffledArray[]=arrayLlist.toArray(new Integer[0]);
		for(int n:shuffledArray) {
			System.out.print(n);
		}
		
	}

}
