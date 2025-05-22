// 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations with different functions directed as
// follows
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
// Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
// size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package ArrayList;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
        // 1. Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        addElements(arrayList);
        addElements(linkedList);

        System.out.println("Initial ArrayList: " + arrayList);
        System.out.println("Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Element at index 2 (ArrayList): " + arrayList.get(2));
        System.out.println("Element at index 2 (LinkedList): " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Kiwi");
        linkedList.set(0, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("ArrayList contains 'Orange': " + arrayList.contains("Orange"));
        System.out.println("LinkedList contains 'Orange': " + linkedList.contains("Orange"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list using for-each
        System.out.println("\nArrayList Iteration (for-each):");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nLinkedList Iteration (Iterator):");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort((LinkedList<String>) linkedList); // safe cast
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        System.out.println("Sublist of ArrayList (index 1 to 3): " + arrayList.subList(1, 3));

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }

    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }
}
