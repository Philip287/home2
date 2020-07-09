package Fil.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Решение задачи №4 домашняя работа №2.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число от 0 до 10: ");
        int number1 = in.nextInt();
        int popitka = 0;
        int randomNumber = 0;
        do {
            randomNumber = 0 + (int) (Math.random() * 11);
            popitka++;
            System.out.println("Номер попытки = " + popitka + ", рандомное число = " + randomNumber);/* строчка
            добавлена для проверки правильности работы, можно убрать*/
        }
        while (randomNumber != number1);
        System.out.println("рандомное число " + randomNumber + " ,угадано с попытки №: " + popitka);

        System.out.println("Решение задачи №3 домашняя работа №2.");
        System.out.println("Сколько радиостанций Р-111, находящаяся в камандно-штабной машине р-142Н? У Вас есть три " +
                "попытки на ответ.");
        for (int shans = 0; shans < 3; shans++) {
            System.out.print("Если вы хотите сдаться введите цифру 10. Введите ваше ответ: ");
            int colichistvoStanc = in.nextInt();
            if (colichistvoStanc == 2) {
                System.out.println("Верно!");
                break;
            } else if (colichistvoStanc == 10) {
                System.out.println("Слабак!");
                break;
            }
            System.out.println("Не верно!");
        }

        System.out.println("Решение задачи №2 домашняя работа №2.");
        int[] daysInMans = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Введите номер проверяемомго дня: ");
        int day = in.nextInt();
        System.out.print("Введите номер проверяемомго месяца (их 12): ");
        int mans = in.nextInt();
        mans = mans - 1;
        if (daysInMans[mans] <= day | day > 0) {
            System.out.println("В месяце № :" + mans + 1 + " день " + day + " существует");
        } else {
            System.out.println("В месяце № :" + mans + 1 + " день " + day + "  не существует ");
        }

        System.out.println("Решение задачи №1 домашняя работа №2.");
        System.out.print("Введите размерность: ");
        int razmer = in.nextInt();
        int layer = 1;
        if (razmer % 2 != 1) ;
        {
            razmer++;
        }
        int[][] array = new int[razmer][razmer];

        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = i; j < array[i].length; j++) {
                for (int k = i; k < array.length; k++) {
                    for (int l = j; l < array.length - k; l++) {
                        array[k][l] = layer;
                        if (l == array.length - k - 1) {
                            array[k][array.length - layer] = layer;
                            array[array.length - layer][k] = layer;
                        }
                    }
                }
            }
            layer++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}