package Homework9;

import Homework9.Enum.Category;
import Homework9.Enum.Priority;

import java.time.LocalDateTime;
import java.util.Date;

public class Ex9 {

    private String NameOfTask;
    private Category Category;
    private Priority priority;
    private Date dateOfPlan;
    private LocalDateTime dateNow;

    public Ex9() {
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
        return "Name of task: " + NameOfTask +
                ". Category: " + Category +
                ". Priority: " + priority +
                ". Date of plan: " + dateOfPlan + ".";
    }
}


