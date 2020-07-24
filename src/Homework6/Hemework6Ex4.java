package Homework6;

import java.util.*;

public class Hemework6Ex4 {
    public static void main(String[] args) {
        HashSet<String> states1 = new HashSet<String>();
        TreeSet<String> states2 = new TreeSet<String>();
        Map<Integer, String> states3 = new HashMap<Integer, String>();
        TreeMap<Integer, String> states4 = new TreeMap<Integer, String>();

        System.out.println("Comparison HashSet & TreeSet in time in add");
        long begin = System.nanoTime();
        states1.add("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d");
        long end = System.nanoTime();
        long result1 = end - begin;

        begin = System.nanoTime();
        states2.add("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d");
        end = System.nanoTime();
        long result2 = end - begin;

        System.out.println("Time HashSet add : " + result1 + " ns");
        System.out.println("Time TreeSet add : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashSet");
        } else {
            System.out.println("The best is TreeSet");
        }

        // next part
        System.out.println("Comparison HashMap & TreeMap in time in add");
        begin = System.nanoTime();
        states3.put(1, "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d");
        end = System.nanoTime();
        result1 = end - begin;

        begin = System.nanoTime();
        states4.put(1, "999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d");
        end = System.nanoTime();
        result2 = end - begin;

        System.out.println("Time HashMap add : " + result1 + " ns");
        System.out.println("Time TreeMap add : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashMap");
        } else {
            System.out.println("The best is TreeMap");
        }
        //next part
        System.out.println("Comparison HashSet & TreeSet in time in search");
        begin = System.nanoTime();
        states1.contains("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "999999999d");
        end = System.nanoTime();
        result1 = end - begin;

        begin = System.nanoTime();
        states2.contains("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "99999999d");
        end = System.nanoTime();
        result2 = end - begin;

        System.out.println("Time HashSet search : " + result1 + " ns");
        System.out.println("Time TreeSet search : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashSet");
        } else {
            System.out.println("The best is TreeSet");
        }
        //next part

        System.out.println("Comparison HashMap & TreeMap in time in search");
        begin = System.nanoTime();
        states3.containsKey(1);
        end = System.nanoTime();
        result1 = end - begin;

        begin = System.nanoTime();
        states4.containsKey(1);
        end = System.nanoTime();
        result2 = end - begin;

        System.out.println("Time HashMap search : " + result1 + " ns");
        System.out.println("Time TreeMap search : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashMap");
        } else {
            System.out.println("The best is TreeMap");
        }


        //next part
        System.out.println("Comparison HashSet & TreeSet in time in remove");
        begin = System.nanoTime();
        states1.remove("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "99999999d");
        end = System.nanoTime();
        result1 = end - begin;

        begin = System.nanoTime();
        states2.remove("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "999999999d");
        end = System.nanoTime();
        result2 = end - begin;

        System.out.println("Time HashSet remove : " + result1 + " ns");
        System.out.println("Time TreeSet remove : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashSet");
        } else {
            System.out.println("The best is TreeSet");
        }

        //next part
        System.out.println("Comparison HashMap & TreeMap in time in remove");
        begin = System.nanoTime();
        states3.remove(1);
        end = System.nanoTime();
        result1 = end - begin;

        begin = System.nanoTime();
        states4.remove(1);
        end = System.nanoTime();
        result2 = end - begin;

        System.out.println("Time HashMap remove : " + result1 + " ns");
        System.out.println("Time TreeMap remove : " + result2 + " ns");
        if (result1 < result2) {
            System.out.println("The best is HashMap");
        } else {
            System.out.println("The best is TreeMap");
        }


    }
}

