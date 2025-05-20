package StringExercise;
import java.util.Scanner;
public class Palindrome {

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        if (str == null) {
	            return false;
	        }

	        // Remove all non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare characters from both ends
	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string to check for palindrome: ");
	        String input = scanner.nextLine();

	        // Check using isPalindrome()
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }
	}

