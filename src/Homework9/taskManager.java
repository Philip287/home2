package Homework9;

import com.sun.jmx.snmp.tasks.TaskServer;

import java.util.ArrayList;
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
            System.out.println(this.Tasks.get(i));
        }
    }

    public taskManager() {
        this.Tasks = new ArrayList<>();
    }

    public void removeTasks() {
        Scanner im = new Scanner(System.in);
        System.out.println("Enter number of task to remove: ");
        int nameToRemove = im.nextInt() - 1;
        Tasks.remove(nameToRemove);
        printTasks();
    }

}
