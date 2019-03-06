/**
 * 
 */
package beginnerChallenges;

/**
 * @author ahall
 *Welcome to cipher day!

write a program that can encrypt texts with an alphabetical caesar cipher. This cipher can ignore numbers, symbols, and whitespace.

for extra credit, add a "decrypt" function to your program!


 */
public class Challenge3 {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = new String();
		String cryptedString = new String();
		Character lowercaseChar;
		int charOffset = 0;
		if (args[0].equals("-d")) { //Decode string
			charOffset = -3;
			inputString = args[1];
		} else {
			charOffset = 3;
			inputString = args[0];
		}
		for (int i = 0; i < inputString.length(); i++) {
			lowercaseChar = Character.toLowerCase(inputString.charAt(i));
			if (lowercaseChar >= 'a' && lowercaseChar <= 'z') {
				if (charOffset > 0) {
					if ((char) ((int) lowercaseChar + charOffset) > 'z') {
						cryptedString += (char) ((int) inputString.charAt(i) + charOffset - 26);
					} else {
						cryptedString += (char) ((int) inputString.charAt(i) + charOffset);
					}
				} else {
					if ((char) ((int) lowercaseChar + charOffset) < 'a') {
						cryptedString += (char) ((int) inputString.charAt(i) + charOffset + 26);
					} else {
						cryptedString += (char) ((int) inputString.charAt(i) + charOffset);
					}
				}
			} else {
				cryptedString += (char) ((int) inputString.charAt(i));
			}
		}
		System.out.println("input string = " + inputString);
		System.out.println("coded string = " + cryptedString);
	}
}