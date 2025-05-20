package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ColorRemover {
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Get input from user for which element to delete
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the position (n) of the element to delete (1-based index): ");
	        int n = scanner.nextInt();
	        scanner.close();

	        // Convert to 0-based index and delete the element if valid
	        int index = n - 1;
	        if (index >= 0 && index < colors.size()) {
	            String removedColor = colors.remove(index);
	            System.out.println("Removed color: " + removedColor);
	        } else {
	            System.out.println("Invalid index! Cannot remove element.");
	        }

	        // Display the updated list
	        System.out.println("Updated list of colors: " + colors);
	    }
	}

