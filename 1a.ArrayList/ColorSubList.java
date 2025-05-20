package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ColorSubList {

	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Extract 1st and 2nd elements (indices 0 and 1)
	        List<String> subColors = colors.subList(0, 2);

	        // Display the extracted sublist
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	    }
	}
