package LinkedList;
import java.util.LinkedList;
public class DisplayLinkedListElements {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add some elements to the list
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");
	        l_list.add("Yellow");
	        l_list.add("Orange");

	        // Display elements and their positions using get(index)
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < l_list.size(); i++) {
	            System.out.println("Position " + i + ": " + l_list.get(i));
	        }
	    }
	}

