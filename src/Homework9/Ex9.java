package Homework9;

import java.time.LocalDateTime;

public class Ex9 {
    private String NameOfTask;
    private String Category;
    private int priority;
    private LocalDateTime dateOfPlan;
    private LocalDateTime dateNow;

    public Ex9(String nameOfTask, String category, int priority, LocalDateTime dateOfPlan, LocalDateTime dateNow) {
        NameOfTask = nameOfTask;
        Category = category;
        this.priority = priority;
        this.dateOfPlan = dateOfPlan;
        this.dateNow = dateNow;
    }

    public String getNameOfTask() {
        return NameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        NameOfTask = nameOfTask;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDateTime getDateOfPlan() {
        return dateOfPlan;
    }

    public void setDateOfPlan(LocalDateTime dateOfPlan) {
        this.dateOfPlan = dateOfPlan;
    }

    public LocalDateTime getDateNow() {
        return dateNow;
    }

    public void setDateNow(LocalDateTime dateNow) {
        this.dateNow = dateNow;
    }

    @Override
    public String toString() {
        return "Ex9" +
                "NameOfTask='" + NameOfTask +
                ", Category='" + Category +
                ", priority=" + priority +
                ", dateOfPlan=" + dateOfPlan +
                ", dateNow=" + dateNow;
    }

}

