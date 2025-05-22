//5. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()

package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSorter {
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add different colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list of colors: " + colors);

	        // Sort the list alphabetically
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted list of colors: " + colors);
	    }
	}
