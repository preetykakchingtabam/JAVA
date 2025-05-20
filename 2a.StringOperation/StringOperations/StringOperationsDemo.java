package StringOperations;
import java.util.Arrays;
public class StringOperationsDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2? " + str1.equals(str2));
	        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String sample = "The quick brown fox jumps over the lazy dog";
	        System.out.println("Index of 'fox': " + sample.indexOf("fox"));
	        System.out.println("Last index of 'the': " + sample.toLowerCase().lastIndexOf("the"));

	        // 5. Substring Operations
	        System.out.println("Substring (4, 9): " + sample.substring(4, 9)); // "quick"
	        System.out.println("Substring from 10: " + sample.substring(10));   // from index 10 till end

	        // 6. String Modification
	        System.out.println("Replace 'fox' with 'cat': " + sample.replace("fox", "cat"));
	        System.out.println("To Uppercase: " + sample.toUpperCase());
	        System.out.println("To Lowercase: " + sample.toLowerCase());

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Hello World!   ";
	        System.out.println("Before trim: '" + strWithSpaces + "'");
	        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation
	        String concatStr = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated string: " + concatStr);

	        // 9. String Splitting
	        String csv = "apple,banana,cherry,dates";
	        String[] fruits = csv.split(",");
	        System.out.println("Fruits array: " + Arrays.toString(fruits));

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder();
	        sb.append("Java ");
	        sb.append("StringBuilder ");
	        sb.append("Demo");
	        System.out.println("StringBuilder content: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        double height = 5.6;
	        String formatted = String.format("Name: %s, Age: %d, Height: %.1f ft", name, age, height);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        String email = "alice@example.com";
	        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("a");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid? " + isValid);
	    }
	}

