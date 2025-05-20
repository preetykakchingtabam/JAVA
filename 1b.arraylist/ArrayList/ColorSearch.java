package ArrayList;
import java.util.ArrayList;
public class ColorSearch {

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Orange");

	        // Display all the colors
	        System.out.println("Available colors: " + colors);

	        // Search for the color "Red"
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}
