package Homework9;

import Homework9.Enum.Category;
import Homework9.Enum.Priority;

import java.time.LocalDateTime;
import java.util.Date;

public class Ex9 {
    private int numberTask;
    private String NameOfTask;
    private Category Category;
    private Priority priority;
    private Date dateOfPlan;
    private LocalDateTime dateNow;

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

    public Homework9.Enum.Category getCategory() {
        return Category;
    }

    public void setCategory(Homework9.Enum.Category category) {
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
                ", Category=" + Category +
                ", priority=" + priority +
                ", dateOfPlan=" + dateOfPlan +
                ", dateNow=" + dateNow ;
    }
}


