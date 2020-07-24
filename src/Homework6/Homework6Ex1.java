package Homework6;


import java.util.Map;
import java.util.stream.Collectors;

public class Homework6Ex1 {
    public static void main(String[] args) {

        String list = ("Белеет парус одинокой\n" +
                "В тумане моря голубом!..\n" +
                "Что ищет он в стране далекой?\n" +
                "Что кинул он в краю родном?");
        System.out.println(calc(list));
    }

    private static Map<Character, Long> calc(
            String str) {
        return str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    }
}
