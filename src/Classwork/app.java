package Classwork;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class app {
    public static void main(String[] args) {

        Queue queue = new ArrayDeque();

    }
    public static void addToQueue(){
        Random random = new Random();
        queue.offer(random.nextInt(10)+1);
    }
}
