package LinkedList;
import java.util.LinkedList;
public class InsertAtEndLinkedList {

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add some colors
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");

	        // Display the original list
	        System.out.println("Original LinkedList: " + l_list);

	        // Insert "Pink" at the end using offerLast()
	        l_list.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + l_list);
	    }
	}
