package StringBufferBuilder;

public class StringBufferBuilderPerformanceTest {
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String appendStr = "AIET";

	        // Test StringBuffer performance
	        StringBuffer stringBuffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(appendStr);
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;

	        // Test StringBuilder performance
	        StringBuilder stringBuilder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(appendStr);
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;

	        // Display the results
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

	        // Justification
	        if (durationBuilder < durationBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else if (durationBuilder > durationBuffer) {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        } else {
	            System.out.println("Both StringBuffer and StringBuilder have similar performance.");
	        }
	    }
	}

