package Homework9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class taskManager {
    public ArrayList<Ex9> Tasks;

    public void addTask(Ex9 task1) {
        this.Tasks.add(task1);
    }

    public void writeToFile(String name) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(this.Tasks);
            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void readFromFile(String name) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name))) {
            this.Tasks = (ArrayList) ois.readObject();
            ois.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

    }

    public void printTasks() {
        int size = this.Tasks.size();
        for (int i = 0; i < size; ++i) {
            System.out.println("Task №" + (i+1) + ". " + this.Tasks.get(i));
            this.Tasks.get(i).dateOfPlane();
        }
    }


    public taskManager() {
        this.Tasks = new ArrayList<>();
    }

    public void removeTasks() {
        Scanner im = new Scanner(System.in);
        System.out.print("Enter number of task to remove: ");
        try {
            int nameToRemove = im.nextInt() - 1;
            Tasks.remove(nameToRemove);
            printTasks();
        } catch (Exception e) {
            System.out.println(" Invalid data, try again!");
            removeTasks();
        }
    }

    public Ex9 getTask(int number) {
        return this.Tasks.get(number);
    }

    public void editTask(Ex9 Task, int number) {
        this.Tasks.set(number, Task);
    }

    public static void saveTask(Ex9 Task) {
        try {

            //Записываем в файл объект Users(спускаем фигуру и запихиваем в коробку)
            FileOutputStream fos = new FileOutputStream("Task");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.close();//oos - это внешний поток.Если мы закрываем внешний то и
            //внутренний тоже.

            //Читаем с файла объект Users(достаем фигуру с коробки и надуваем)
            FileInputStream fis = new FileInputStream("Task");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();//Получаем объекты в том порядке,в котором
            //записывали(Спустили фигуру собачки и положили в коробку первую,значит
            //и достаем тогда её первой и надуваем
            //Так как Object нужно привести к типу ниже в иерархии
            ois.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            //Данное исключение может появиться,если класс объекта,
            //которые мы хотим надуть не найден.
            ex.printStackTrace();
        }
    }

}