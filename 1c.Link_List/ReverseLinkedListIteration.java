//2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())

package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class ReverseLinkedListIteration {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Use descendingIterator() to iterate in reverse order
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        System.out.println("Iterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}

