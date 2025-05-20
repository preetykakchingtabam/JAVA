package StringExercise;

public class NullOrWhitespaceCheck {

	    // User-defined method to check null or whitespace-only string
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    public static void main(String[] args) {
	        String test1 = null;
	        String test2 = "    ";
	        String test3 = "Hello";
	        String test4 = "";

	        System.out.println("test1 is null or empty? " + isNullOrEmpty(test1)); // true
	        System.out.println("test2 is null or empty? " + isNullOrEmpty(test2)); // true
	        System.out.println("test3 is null or empty? " + isNullOrEmpty(test3)); // false
	        System.out.println("test4 is null or empty? " + isNullOrEmpty(test4)); // true
	    }
	}

