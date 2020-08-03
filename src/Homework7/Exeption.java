package Homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        BookShelf first = new BookShelf(Category.Philosophy, 2, 1, new ArrayList<Book>());
        BookShelf second = new BookShelf(Category.History, 2, 2, new ArrayList<Book>());
        BookShelf third = new BookShelf(Category.Science, 2, 3, new ArrayList<Book>());


        boolean continueInput = true;


    public static boolean getUserChoice() {
        System.out.println("Continue?");
        boolean continueInput = false;
        try {
            continueInput = scanner.nextBoolean();
        } catch (Exception e) {
            System.out.println("User can't do right choice");
        }
        return continueInput;
    }

    public static Book getBookFromUser() {

        BookName name = getBookName();

        Integer power = 7;
        try {
            power = getPowerFromUser();
        } catch (InvalidCarPowerException e) {
            System.out.println(e);
        }

        System.out.println("Please input price of car : ");
        Integer price = scanner.nextInt();
        return new Car(name, power, price);
    }

    public static CarName getCarName() {
        System.out.println("Please input name of car : ");
        try {
            return doGetCarName();
        } catch (InvalidCarNameException e) {
            return getCarName();
        }
    }

    private static CarName doGetCarName() throws InvalidCarNameException {
        String nameFromUser = scanner.next();
        switch (nameFromUser) {
            case "bmw":
                return CarName.BMW;
            case "vw":
                return CarName.VW;
            case "lada":
                return CarName.LADA;
            default:
                throw new InvalidCarNameException(nameFromUser);
        }
    }

    public static Integer getPowerFromUser() throws InvalidCarPowerException {
        System.out.println("Please input power of car : ");
        String powerFromUser = null;
        try {
            powerFromUser = scanner.next();
            return Integer.parseInt(powerFromUser);
        } catch (NumberFormatException e) {
            throw new InvalidCarPowerException(powerFromUser);
        }
    }

    public static void printList(List<Car> list) {
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }


}