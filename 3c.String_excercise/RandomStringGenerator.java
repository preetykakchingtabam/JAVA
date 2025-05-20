package stringexercise;
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {

	    // User-defined function to generate a random string
	    public static String generateRandomString(int length) {
	        if (length <= 0) {
	            return "";
	        }

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder();
	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for desired length
	        System.out.print("Enter the length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate and print the random string
	        String randomStr = generateRandomString(length);
	        System.out.println("Generated Random String: " + randomStr);
	    }
	}

