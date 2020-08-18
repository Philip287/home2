package Homework9;

import Homework9.Enum.Category;
import Homework9.Enum.Priority;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        menu();
    }

    public static void СurrentTask(List<Ex9> Tasks) {
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
                System.out.println("Input name");
                String nameToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getNameOfTask().toLowerCase(), nameToFilter))
                        .forEach(System.out::println);
                break;
            case 2:
                System.out.println("Input category");
                String categoryToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getCategory().getValue1().toLowerCase(), categoryToFilter))
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.println("Input priority");
                String priorityToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getPriority().getValue().toLowerCase(),
                                priorityToFilter))
                        .forEach(System.out::println);
                break;
            case 4:
                System.out.println("Input date of plan");
                String dateOfPlanToFilter = in.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getDateOfPlan().toString().toLowerCase(),
                                dateOfPlanToFilter))
                        .forEach(System.out::println);
                break;
            case 5:
                System.out.println("You choice exit looser!");
                break;
            default:
                System.out.println("You enter un correct number");
        }
    }

    public static void menu() {
        Scanner im = new Scanner(System.in);
        int firstChoise;
        taskManager mainP = new taskManager();
        do {
            System.out.println(mainP);
            System.out.println("What do you wont?");
            System.out.println("If you wont: \n" +
                    "Enter number 1 if you wont add new task. \n" +
                    "Enter number 2 if you wont preview current tasks, filter according to a certain criterion. \n" +
                    "Enter number 3 if you wont edit task. \n" +
                    "Enter number 4 if you wont remove task. \n" +
                    "Enter number 5 to EXIT. \n");
            firstChoise = im.nextInt();
            switch (firstChoise) {
                case 1:
                    Ex9 task1 = new Ex9();
                    task1.setNumberTask(addNumber());
                    System.out.println("Enter Name Of Task");
                    String name = im.nextLine(); // следующие три строчки можно сделать одной, но моя "идея" баг ловит, не знаю почему.
                    name = im.nextLine();
                    task1.setNameOfTask(name);
                    System.out.println("Enter Category Of Task (Home, Work or Other)");
                    task1.setCategory(addCategory());
                    System.out.println("Enter Priority Of Task (High, Middle or Low)");
                    task1.setPriority(addPriority());
                    task1.setDateOfPlan(strToDate());
                    mainP.addTask(task1);
                    break;
                case 2:
                    mainP.printTasks();
                    СurrentTask(mainP.Tasks);
                    break;
                case 3:
                    //                   СurrentTask(mainP.Tasks);
                    break;
                case 4:
                    mainP.printTasks();
                    mainP.removeTasks();
                break;
                case 5:
                    break;
                default:
                    System.out.println("You enter un correct data! Try again");
            }
        }
        while (firstChoise != 5);

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

    public static Priority addPriority() {
        do {
            Scanner im = new Scanner(System.in);
            String priority = im.nextLine();
            if (priority.equals(Priority.HIGH.getValue())) {
                return (Priority.HIGH);
            } else if (priority.equals(Priority.LOW.getValue())) {
                return (Priority.LOW);
            } else if (priority.equals(Priority.MIDDLE.getValue())) {
                return (Priority.MIDDLE);
            } else {
                System.out.println("Try again! Enter Priority Of Task (High, Middle or Low): ");
            }
        } while (true);

    }

    public static Category addCategory() {
        do {
            Scanner im = new Scanner(System.in);
            String category = im.nextLine();
            if (category.equals(Category.HOME.getValue1())) {
                return (Category.HOME);
            } else if (category.equals(Category.WORK.getValue1())) {
                return (Category.WORK);
            } else if (category.equals(Category.OTHER.getValue1())) {
                return (Category.OTHER);
            } else {
                System.out.println("Try again! Enter Category Of Task (Home, Work or Other): ");
            }
        } while (true);

    }

    public static int addNumber() {
        do {
            System.out.println("Enter Number of task (From 1 to 10)");
            Scanner im = new Scanner(System.in);
            int number;
            try {
                number = Integer.parseInt(im.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid parametrs. Try again! ");
                number = 0;
            }
            if (number <= 10 && number >= 1) {
                return number;
            }
        } while (true);
    }
    }


