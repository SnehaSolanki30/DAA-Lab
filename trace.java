import java.util.Arrays;

public class trace {
    public static void main(String[] args) {

        int[] numbers = {8, 3, 15, 6, 2};

        int max = numbers[0];
        int comparisons = 0;

        System.out.println("Dry Run:");

        for (int i = 1; i < numbers.length; i++) {
            comparisons++;

            if (numbers[i] > max) {
                max = numbers[i];
            }

            System.out.println("i = " + i +
                    ", A[i] = " + numbers[i] +
                    ", max = " + max +
                    ", comparisons = " + comparisons);
        }

        System.out.println("\nLargest Number: " + max);
        System.out.println("Comparisons Made: " + comparisons);

        Arrays.sort(numbers);

        System.out.println("Sorted List: " + Arrays.toString(numbers));
    }
}