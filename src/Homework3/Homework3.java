package Homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Рещение задачи №1, домашняя работа №3/ Сформировать строку, которая содержит " +
                "100 случайных значений от 0 до 1000, разделённых пробелами (2 способа - String и StringBuilder)");
        int STR_LENGTH = 100;
        String str1 = "";
        StringBuilder builder = new StringBuilder(str1);
        for (int j = 0; j < STR_LENGTH; j++) {
            int znachenie = (int) (Math.random() * 1000);
            builder.append(znachenie + " ");
        }
        System.out.println(builder);
    }

}



