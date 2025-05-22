//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
package stringexercise;
import java.util.Scanner;
public class WordCapitalizer {


	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        String[] words = str.trim().split("\\s+");  // Split by one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter and append rest in lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim();  // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Apply capitalization
	        String result = capitalizeWords(input);

	        System.out.println("Capitalized sentence: " + result);
	    }
	}

