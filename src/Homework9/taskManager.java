package Homework9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class taskManager {
    public List<Ex9> Tasks;

    public void addTask(Ex9 task1) {
        this.Tasks.add(task1);
    }

    public void printTasks() {
        int size = this.Tasks.size();
        for (int i = 0; i < size; ++i) {
            int n = 1;
            System.out.println("Task №" + n + ". " + this.Tasks.get(i));
            n += 1;
            Date nowDate = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            nowDate = new Date(nowDate.getTime());
            System.out.println("Today is: " + nowDate);
        }
    }

    public taskManager() {
        this.Tasks = new ArrayList<>();
    }

    public void removeTasks() {
        Scanner im = new Scanner(System.in);
        System.out.println("Enter number of task to remove: ");
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

}
