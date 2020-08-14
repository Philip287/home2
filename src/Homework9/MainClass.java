package Homework9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        List<Ex9> Tasks = new ArrayList<>();
        menu(Tasks);
    }

    public static void Enumeration(List<Ex9> Tasks) {
        for (int i = 0; i < Tasks.size(); i++) {
            System.out.println(Tasks.get(i).toString());
        }

    }

    public static void СurrentTask(List<Ex9> Tasks) {
        Enumeration(Tasks);
        Scanner in = new Scanner(System.in);
        System.out.print("Input: \n " +
                "Number 1 if you want to a criterion for filter of name of task \n" +
                "Number 2 if you want to a criterion for filter of category \n" +
                "Number 3 if you want to a criterion for filter of priority \n" +
                "Number 4 if you want to a criterion for filter of date of plan \n" +
                "Number 5 if you want EXIT \n");

        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Input name");
                String nameToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getNameOfTask().toLowerCase(), nameToFilter))
                        .forEach(System.out::println);
                break;
            case 2:
                System.out.print("Input category");
                String categoryToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getCategory().toLowerCase(), categoryToFilter))
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.print("Input priority");
                String priorityToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getPriority().getValue().toLowerCase(),
                                priorityToFilter))
                        .forEach(System.out::println);
                break;
            case 4:
                System.out.print("Input date of plan");
                String dateOfPlanToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getDateOfPlan().toString().toLowerCase(),
                                dateOfPlanToFilter))
                        .forEach(System.out::println);
                break;
            case 5:
                System.out.print("You choice exit looser!");
                break;
            default:
                System.out.println("You enter un correct number");
        }
    }

    public static void menu(List<Ex9> Tasks) {
        Scanner im = new Scanner(System.in);
        int firstChoise;
        do {
            System.out.println("What do your wont?");
            System.out.println("If you wont: \n" +
                    "Enter number 1 if you wont add new task. \n" +
                    "Enter number 2 if you wont preview current tasks, filter according to a certain criterion. \n" +
                    "Enter number 3 if you wont edit task. \n" +
                    "Enter number 4 if you wont remove task. \n" +
                    "Enter number 5 to EXIT. \n");
            firstChoise = im.nextInt();
            switch (firstChoise) {
                case 1:
                    addTask(Tasks);
                    break;
                case 2:
                    СurrentTask(Tasks);
                    break;
                case 3:
                    СurrentTask(Tasks);
                    break;
                case 4:
                    СurrentTask(Tasks);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("You enter un correct data! Try again");
            }
        }
        while (firstChoise != 5);

    }

    public static void addTask(List<Ex9> Tasks) {
        Ex9 task1 = new Ex9();
        Scanner im = new Scanner(System.in);
        System.out.println("Enter Number of task");
        task1.setNumberTask(im.nextInt());
        System.out.println("Enter Name Of Task");
        task1.setNameOfTask(im.nextLine());
        System.out.println("Enter Category Of Task");
        task1.setCategory(im.nextLine());
        System.out.println("Enter Priority Of Task");
        String priority = im.nextLine();
        if (priority == Priority.HIGH.getValue()) {
            task1.setPriority(Priority.HIGH);
        } else if (priority == Priority.LOW.getValue()) {
            task1.setPriority(Priority.LOW);
        } else if (priority == Priority.MIDDLE.getValue()) {
            task1.setPriority(Priority.MIDDLE);
        } else {
            System.out.println("You enter un correct date");
        }
        task1.setDateOfPlan (strToDate());
        task1.setDateNow(LocalDateTime.now());
        Tasks.add(task1);
        System.out.println(Tasks);
    }

    public static Date strToDate() {
        Scanner im = new Scanner(System.in);
        System.out.println("Enter Date Of Task like 2011-11-11");
        String str = im.nextLine();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            return parsingDate;
        } catch (ParseException e) {
            System.out.println("Try again");
            return strToDate();
        }
    }
}
