package Homework9;

import Homework9.Enum.Category;
import Homework9.Enum.Priority;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ex9 implements Serializable {

    private String NameOfTask;
    private Category Category;
    private Priority priority;
    private Date dateOfPlan;

    public Ex9(String nameOfTask, Homework9.Enum.Category category, Priority priority, Date dateOfPlan) {
        NameOfTask = nameOfTask;
        Category = category;
        this.priority = priority;
        this.dateOfPlan = dateOfPlan;
    }

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

    public void dateOfPlane() {
        Date dateNow = new Date();

        long raz = this.dateOfPlan.getTime() - dateNow.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
        dateNow = new Date(dateNow.getTime());
        try {
            long milliseconds = dateOfPlan.getTime() - dateNow.getTime();
            if (milliseconds <= 3600000) {
                // 1000 миллисекунд = 1 секунда
                // 3 600 секунд = 60 минут = 1 час
                int hours = (int) (milliseconds / (60 * 60 * 1000));
                System.out.println("There are still hours to complete the task : " + hours);
            }   // 24 часа = 1 440 минут = 1 день
            else {
                double days = (int) (milliseconds / (24 * 60 * 60 * 1000));
                System.out.println("There are still days to complete the task: " + days);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Name of task: " + NameOfTask +
                ". Category: " + Category +
                ". Priority: " + priority +
                ". Date of plan: " + dateOfPlan + ".";
    }
}