package Homework9;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

    }

    public static void Enumeration(List <Ex9> Tasks) {
        for (int i = 0; i < Tasks.size(); i++) {
            System.out.println(Tasks.get(i).toString());
        }

    }
    public static void СurrentTask (List <Ex9> Tasks) {
        Enumeration(Tasks);
        Scanner in = new Scanner(System.in);
        System.out.print("Input: \n " +
                "Number 1 if you want to a criterion for filter of name of task \n" +
                "Number 2 if you want to a criterion for filter of category \n" +
                "Number 3 if you want to a criterion for filter of priority \n" +
                "Number 4 if you want to a criterion for filter of date of plan \n");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                List<Ex9> services = resp.getServices();
                services.stream()
                        .filter(service -> Objects.equals(service.getNameOfTask(), "0"))
                        .forEach(System.out::println);
                break;
            case 2:
                List<Ex9> services = resp.getServices();
                services.stream()
                        .filter(service -> Objects.equals(service.getNameOfTask(), "0"))
                        .forEach(System.out::println);

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("You enter un correct number");
        }
    }
}
