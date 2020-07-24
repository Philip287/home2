package Homework6;


import java.util.ArrayDeque;
import java.util.Queue;

public class Hpmework6Ex3 {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>(10);
        int j = 0;
        int chislo = 5;
        boolean proverka = false;
        do {
            queue.removeAll(queue);
            for (int i = 0; i < 10; i++) {
                j = (int) (Math.random() * (0 - 10 + 1) + 10);
                boolean add = queue.add(j);
            }
            proverka = queue.contains(chislo);
        }
        while (proverka != true);

        System.out.println("Game is started, list numbers is:");
        printQueue(queue);

        int i;
        Integer remove;
        for (i = 0; i < 10; i++) {
            remove = queue.remove();
            if (remove == chislo) {
                break;
            }

        }
        if (i % 2 == 0) {
            System.out.println("The first player winner");
        } else {
            System.out.println("The second player winner");
        }

    }

    private static void printQueue(Queue queue) {
        System.out.println("Queue");
        queue.forEach(System.out::println);
    }
}
