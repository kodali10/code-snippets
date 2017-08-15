
public class StringPalindrome {
	public static boolean palindromeChecker(char[] charArray) {
		int i1 = 0;
		int i2 = charArray.length - 1;
		while(i1<i2){
		if (charArray[i1] != charArray[i2]) {
			return false;
		}
		++i1;
		--i2;
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "MAMAM";
		char[] charArray = word.toCharArray();
		boolean isPalindrome = palindromeChecker(charArray);
		System.out.println("The string entered is palindrome: " + isPalindrome);
	}
}
