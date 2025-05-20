package LinkedList;
import java.util.Collections;
import java.util.LinkedList;
public class SwapElementsInLinkedList {

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add some elements
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");
	        l_list.add("Yellow");
	        l_list.add("Orange");

	        // Display original list
	        System.out.println("Original LinkedList: " + l_list);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(l_list, 0, 2);

	        // Display list after swap
	        System.out.println("LinkedList after swapping first and third elements: " + l_list);
	    }
	}

