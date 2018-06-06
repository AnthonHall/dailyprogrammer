/**
 * 
 */
package beginnerChallenges;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ahall
 * create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:
 *
 * your name is (blank), you are (blank) years old, and your username is (blank)
 *
 * for extra credit, have the program log this information in a file to be accessed later.
 */
public class Challange1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("What is your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("What is your age: ");
		String age = scanner.nextLine();

		System.out.println("What is your reddit username: ");
		String username = scanner.nextLine();
		scanner.close();
		System.out.println("your name is " + name + ", you are " + age + " years old, and your username is " + username);
		
		//Extra credit
		List<String> lines = Arrays.asList(name, age, username);
		try {
		Path file = Paths.get("Beginner Challenge 1.txt");
		Files.write(file, lines, Charset.forName("UTF-8"));
		//Files.write(file, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			
		}
	}

}
