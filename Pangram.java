package question3;

public class Pangram {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
		str=str.toLowerCase();
		boolean isPangram=str.chars().filter(Character::isAlphabetic).distinct().count()==26;
		if(isPangram) {
			System.out.println("true;");
		}
		else {
			System.out.println("false;");
		}
	}

}
