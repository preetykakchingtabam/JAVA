package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListIteratorDemo {
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

        // Create an iterator starting from index 1 (2nd element)
        ListIterator<String> iterator = colors.listIterator(1);

        // Iterate from the 2nd element to the end
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
