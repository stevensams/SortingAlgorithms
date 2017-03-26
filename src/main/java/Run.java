import java.io.Console;
import java.util.regex.Pattern;
import java.util.Random;

import sams.steven.algorithms.SelectionSort;

public class Run {

    public static void main(String args[]) {

        Console console = System.console();
        if (console == null) {
            System.out.println("Unable to fetch console");
            return;
        }

        console.printf("+--------------------------+%n");
        console.printf("| Pick a Sorting Algorithm |%n");
        console.printf("+-----------------+--------+%n");
        console.printf("| Algorithm       | Hit    |%n");
        console.printf("+-----------------+--------+%n");
        console.printf("| Selection Sort  | (s)    |%n");
        console.printf("| Merge Sort      | (m)    |%n");
        console.printf("| Quick Sort      | (q)    |%n");
        console.printf("| Heap Sort       | (h)    |%n");
        console.printf("+-----------------+--------+%n");

        String sort = console.readLine("$ ");

        String pattern = ".*[s|m|q|h]+.*";

        if(!Pattern.matches(pattern, sort)) {
            console.printf("Incorrect selection: %s%n", sort);
            return;
        }

        String items = console.readLine("Number of random integers to sort: ");
        String tests = console.readLine("Number of tests to run: ");

        pattern = ".*[0-9]+.*";

        if(!Pattern.matches(pattern, items) || !Pattern.matches(pattern, tests)) {
            console.printf("incorrect input. Only numerical input allowed%n", sort);
            return;
        }

        int testCount = Integer.valueOf(tests) + 1;
        int itemCount = Integer.valueOf(items);

        if(sort.equals("s")) {
            Object[] experiment = { "Selection Sort", items, tests};
            console.printf("Running %s on %s random ints over %s tests%n", experiment);
        } else if(sort.equals("m")) {
            Object[] experiment = { "Merge Sort", items, tests};
            console.printf("Running %s on %s random ints over %s tests%n", experiment);
        } else if(sort.equals("q")) {
            Object[] experiment = { "Quick Sort", items, tests};
            console.printf("Running %s on %s random ints over %s tests%n", experiment);
        } else if(sort.equals("h")) {
            Object[] experiment = { "Heap Sort", items, tests};
            console.printf("Running %s on %s random ints over %s tests%n", experiment);
        } else {
            return;
        }

        for (int i = 1; i < testCount; i++ ){
            long startTime = System.currentTimeMillis();
            generateRandomArray(itemCount);
            long endTime = System.currentTimeMillis();
            console.printf("|  %s  | %d |%n", (i), (endTime-startTime));
        }

    }

    private static void streetsign() {

        //https://s-media-cache-ak0.pinimg.com/736x/d1/99/e8/d199e88184de55dc1b00aa450bcf348f.jpg
        // flemish bond

        Console console = System.console();
        console.printf("+---+---+---+---+--------------+%n");
        console.printf("|   |---+---+---+--------------+%n");
        console.printf("+---+---+---+---+--------------+%n");
        console.printf("+--------------------------+%n");

        console.printf("| Pick a Sorting Algorithm |%n");
        console.printf("+-----------------+--------+%n");
        console.printf("| Algorithm       | Hit    |%n");
        console.printf("+-----------------+--------+%n");
        console.printf("| Selection Sort  | (s)    |%n");
        console.printf("| Merge Sort      | (m)    |%n");
        console.printf("| Quick Sort      | (q)    |%n");
        console.printf("| Heap Sort       | (h)    |%n");
        console.printf("+-----------------+--------+%n");

    }

    private static String[] formatExperiment(String... variables) {
        return null;
    }

    private static int[] generateRandomArray(int size) {

        int a[] = new int[size];
        Random Generator=new Random();

        for(int i = 0; i<a.length; i++) {
            a[i] = Generator.nextInt(size);
        }
        return a;
    }
}