package Homework9;

import java.time.LocalDateTime;
import java.util.Date;

public class Ex9 {
    private int numberTask;
    private String NameOfTask;
    private String Category;
    private Priority priority;
    private Date dateOfPlan;
    private LocalDateTime dateNow;

    public Ex9(int numberTask, String nameOfTask, String category, Priority priority, Date dateOfPlan, LocalDateTime dateNow) {
        this.numberTask = numberTask;
        NameOfTask = nameOfTask;
        Category = category;
        this.priority = priority;
        this.dateOfPlan = dateOfPlan;
        this.dateNow = dateNow;
    }

    public Ex9() {
    }

    public int getNumberTask() {
        return numberTask;
    }

    public void setNumberTask(int numberTask) {
        this.numberTask = numberTask;
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

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDateOfPlan() {
        return dateOfPlan;
    }

    public void setDateOfPlan(Date dateOfPlan) {
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
                "numberTask=" + numberTask +
                ", NameOfTask='" + NameOfTask +
                ", Category='" + Category +
                ", priority=" + priority +
                ", dateOfPlan=" + dateOfPlan +
                ", dateNow=" + dateNow;
    }
}

