public class Complexity {

    public static void main(String[] args) {

        // Part 4.1
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            count++;
        }

        System.out.println("\nSingle loop runs: " + count);

        // Part 4.2
        int n = 20;
        System.out.println("If n = " + n + ", loop runs: " + n + " times");

        // Part 4.3
        int nestedCount = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                nestedCount++;
            }
        }

        System.out.println("\nNested loop total prints: " + nestedCount);

        // Part 4.4
        int n2 = 10;
        int totalPrints = 0;

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2; j++) {
                totalPrints++;
            }
        }

        System.out.println("If n = " + n2 + ", PRINT runs: " + totalPrints + " times");
    }
}
