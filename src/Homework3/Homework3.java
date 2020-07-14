package Homework3;


import java.util.Arrays;
import java.util.Scanner;

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

//Пользователь вводит имя и возраст. Вывести сообщение, приветствующее
// пользователя. - форматирование (String.format) через спецификаторы

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.print("input your first name:  ");
        String firstName = sc.nextLine();

        System.out.print("input your second name: ");
        String secondtName = sc.nextLine();

        System.out.print("input your year of birth: ");
        int year = in.nextInt();

        System.out.format("Hello!!! Your are %s %s! your year of birth %d!", firstName, secondtName, year);

//Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова.
// - через split - будет считать разделителем пробел
        System.out.println();
        String string = "Клара украла у Карла какралы а Карл у Клары украл кларнет";
        System.out.println("Проверяемая строка: " + string);
        String stringLowerCase = string.toLowerCase();
        String zero = " ";

        String[] arrString = stringLowerCase.split(zero);
        Arrays.sort(arrString);


        for (int i = 0; i < arrString.length; ) {
            String copy = arrString[i];
            int count = 1;

            while (++i < arrString.length && arrString[i].equals(copy))
                ++count;

            System.out.println(copy + " -  " + count);

        }
    }
}



