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
        Scanner im4 = new Scanner(System.in);
        System.out.print("Input: \n" +
                "Number 1 if you want to a criterion for filter of name of task \n" +
                "Number 2 if you want to a criterion for filter of category \n" +
                "Number 3 if you want to a criterion for filter of priority \n" +
                "Number 4 if you want to a criterion for filter of date of plan \n" +
                "Number 5 if you want EXIT \n");
        int choice = im4.nextInt();
        switch (choice) {
            case 1:
                Scanner im5 = new Scanner(System.in);
                System.out.print("Input name :");
                String nameToFilter;
                nameToFilter = im5.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getNameOfTask().toLowerCase(), nameToFilter))
                        .forEach(System.out::println);
                break;
            case 2:
                Scanner im6 = new Scanner(System.in);
                System.out.print("Input category :");
                String categoryToFilter = im6.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getCategory().getValue1().toLowerCase(),
                                categoryToFilter))
                        .forEach(System.out::println);
                break;
            case 3:
                Scanner im7 = new Scanner(System.in);
                System.out.print("Input priority :");
                String priorityToFilter = im7.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getPriority().getValue().toLowerCase(),
                                priorityToFilter))
                        .forEach(System.out::println);
                break;
            case 4:
                Scanner im8 = new Scanner(System.in);
                System.out.print("Input date of plan :");
                String dateOfPlanToFilter = im8.nextLine().toLowerCase();
                Tasks.stream()
                        .filter(service -> Objects.equals(service.getDateOfPlan().toString().toLowerCase(),
                                dateOfPlanToFilter))
                        .forEach(System.out::println);
                break;
            case 5:
                System.out.println("You choice exit!");
                break;
            default:
                System.out.println("You enter un correct number");
        }
    }

    public static void menu() {
        try {
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
                System.out.print("Enter you your choice: ");
                firstChoise = im.nextInt();
                switch (firstChoise) {
                    case 1:
                        Ex9 task1 = new Ex9();
                        System.out.print("Enter Name Of Task: ");
                        String name = im.nextLine(); // следующие три строчки можно сделать одной, но моя "идея" баг ловит, не знаю почему.
                        name = im.nextLine();
                        task1.setNameOfTask(name);
                        task1.setCategory(addCategory());
                        task1.setPriority(addPriority());
                        task1.setDateOfPlan(strToDate());
                        mainP.addTask(task1);
                        break;
                    case 2:
                        mainP.printTasks();
                        СurrentTask(mainP.Tasks);
                        break;
                    case 3:
                        mainP.printTasks();
                        System.out.println("Enter number of task what do you need edit?");
                        String elementToEdit;
                        Scanner im2 = new Scanner(System.in);
                        elementToEdit = im2.nextLine();
                        Ex9 task = mainP.getTask(Integer.parseInt(elementToEdit) - 1);
                        mainP.editTask(correctTask(task), Integer.parseInt(elementToEdit) - 1);
                        break;
                    case 4:
                        mainP.printTasks();
                        mainP.removeTasks();
                        break;
                    case 5:
                        System.out.println("You enter exit!");
                        break;
                    default:
                        System.out.println("You enter un correct data! Try again");
                }
            }
            while (firstChoise != 5);
        } catch (Exception e) {
            System.out.println("You enter un correct data! Try again");
            menu();
        }
    }

    public static Date strToDate() {
        Scanner im = new Scanner(System.in);
        System.out.print("Enter Date Of Task like 2011-12-31: ");
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
        try {
            do {
                System.out.print("Enter Priority Of Task (High, Middle or Low): ");
                Scanner im = new Scanner(System.in);
                String priority = im.nextLine();
                if (priority.equals(Priority.HIGH.getValue())) {
                    return (Priority.HIGH);
                } else if (priority.equals(Priority.LOW.getValue())) {
                    return (Priority.LOW);
                } else if (priority.equals(Priority.MIDDLE.getValue())) {
                    return (Priority.MIDDLE);
                } else {
                    System.out.println("Try again! ");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Try again! ");
        }
        return addPriority();

    }

    public static Category addCategory() {
        try {
            do {
                System.out.print("Enter Category Of Task (Home, Work or Other): ");
                Scanner im = new Scanner(System.in);
                String category = im.nextLine();
                if (category.equals(Category.HOME.getValue1())) {
                    return (Category.HOME);
                } else if (category.equals(Category.WORK.getValue1())) {
                    return (Category.WORK);
                } else if (category.equals(Category.OTHER.getValue1())) {
                    return (Category.OTHER);
                } else {
                    System.out.println("Try again! ");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Try again! ");
            return addCategory();
        }

    }

    public static Ex9 correctTask(Ex9 task) {
        try {
            System.out.println(task);
            System.out.println("Enter that you want to insert in his place: ");
            System.out.println("Name of task (1) " + "Category (2) " + "Priority (3) " +
                    "Date of plan (4) ");
            Scanner im3 = new Scanner(System.in);
            String editElement = im3.nextLine();
            switch (Integer.parseInt(editElement)) {
                case 1:
                    System.out.println("Enter new name of task: ");
                    String newNameOfTask = im3.nextLine();
                    task.setNameOfTask(newNameOfTask);
                    break;
                case 2:
                    task.setCategory(addCategory());
                    break;
                case 3:
                    task.setPriority(addPriority());
                    break;
                case 4:
                    task.setDateOfPlan(strToDate());
                    break;
                default:
                    System.out.println("You enter un correct data! Try again");
            }
            return task;
        } catch (Exception e) {
            System.out.println("You enter un correct data! Try again");
            return correctTask(task);
        }
    }
}

//    public static int addNumber() {
//        do {
//            System.out.println("Enter Number of task (From 1 to 10)");
//            Scanner im = new Scanner(System.in);
//            int number;
//            try {
//                number = Integer.parseInt(im.nextLine());
//            } catch (Exception e) {
//                System.out.println("Invalid parametrs. Try again! ");
//                number = 0;
//            }
//            if (number <= 10 && number >= 1) {
//                return number;
//            }
//        } while (true);
//    }



