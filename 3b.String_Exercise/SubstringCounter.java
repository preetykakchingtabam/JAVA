package StringExercise;

public class SubstringCounter {

	    // User-defined function to count occurrences of a substring
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Search for substring until it's no longer found
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move index forward to avoid overlapping
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String mainString = "hello world, hello user, hello Java";
	        String subString = "hello";

	        int occurrences = countOccurrences(mainString, subString);
	        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times in the main string.");
	    }
	}

