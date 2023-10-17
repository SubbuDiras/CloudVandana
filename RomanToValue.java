package question2;

import java.util.*;

public class RomanToValue {

	public static void main(String[] args) {
		String str="XIV";
		Map<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=0;
		int preValue=0;
		//looping the given string from last letter to first
		for(int i=str.length()-1;i>=0;i--)
		{
			int curValue=map.get(str.charAt(i));
			
			if(curValue<preValue) 
			{
				//decrementing value
				result-=curValue;
			}
			else {
				//incrementing value
				result+=curValue;
			}
			preValue=curValue;
		}
//printing the final result
System.out.println(result);
	}

}
