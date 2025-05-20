package ArrayList;
import java.util.ArrayList;
public class ColorManager {
	 public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list of colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedColor = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedColor);
	        } else {
	            System.out.println("Not enough elements to remove the 2nd one.");
	        }

	        // Remove the color "Blue" (if it exists)
	        boolean removedBlue = colors.remove("Blue");
	        if (removedBlue) {
	            System.out.println("Removed the color 'Blue' from the list.");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Display updated list
	        System.out.println("Updated list of colors: " + colors);
	    }
}
