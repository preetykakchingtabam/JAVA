package StringExercise;
import java.util.Scanner;
public class ReverseString {

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Call the reverseString function
	        String reversed = reverseString(input);

	        System.out.println("Reversed string: " + reversed);
	    }
	}


