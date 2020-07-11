package Homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
//Рещение задачи №1,2 домашняя работа №3/ Сформировать строку, которая содержит
//100 случайных значений от 0 до 1000, разделённых пробелами (2 способа - String и StringBuilder)")
//В сформированной строке заменить все двузначные числа на -1. - RegEx - регулярные выражения
        int STR_LENGTH = 100;
        String str1 = "";
        StringBuilder builder = new StringBuilder(str1);
        for (int j = 0; j < STR_LENGTH; j++) {
            int znachenie = (int) (Math.random() * 1000);
            builder.append(znachenie + " ");
        }
        System.out.println(builder);

        String sas = builder.toString();
        String sas1 = sas.replaceAll("\\s\\d{2}\\s", " -1 ");

        System.out.println(sas1);

    }

}



