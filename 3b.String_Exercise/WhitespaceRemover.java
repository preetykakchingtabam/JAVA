package StringExercise;
import java.util.Scanner;
public class WhitespaceRemover {


	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        if (str == null) {
	            return null;
	        }
	        // \s matches any whitespace character
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string with whitespace: ");
	        String input = scanner.nextLine();

	        // Remove whitespace using the function
	        String result = removeWhitespace(input);

	        System.out.println("String after removing whitespace: " + result);
	    }
	}
