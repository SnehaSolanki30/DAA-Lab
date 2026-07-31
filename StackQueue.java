import java.util.*;

public class StackQueue {

    public static void main(String[] args) {

        String[] tasks = {"Task1", "Task2", "Task3", "Task4", "Task5"};

        // Stack (LIFO)
        Stack<String> stack = new Stack<>();

        for (String task : tasks) {
            stack.push(task);
        }

        System.out.println("Stack Order (LIFO):");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\n");

        // Queue (FIFO)
        Queue<String> queue = new LinkedList<>();

        for (String task : tasks) {
            queue.offer(task);
        }

        System.out.println("Queue Order (FIFO):");

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println("\n");

        System.out.println("Printer should use Queue (FIFO)");
        System.out.println("Print Order:");

        for (String task : tasks) {
            System.out.print(task + " ");
        }
    }
}