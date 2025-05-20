package stringexercise;
import java.util.Scanner;
public class StringTruncator {

	    // User-defined function to truncate the string
	    public static String truncate(String str, int maxLength) {
	        if (str == null || maxLength < 0) {
	            return str;
	        }

	        if (str.length() <= maxLength) {
	            return str;
	        }

	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength); // handle tiny limits
	        }

	        return str.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Truncate and print result
	        String result = truncate(input, maxLength);
	        System.out.println("Truncated string: " + result);
	    }
	}

