package test4;

import java.util.Scanner;

public class Main4 {
    static void section() {
        System.out.print("Введите начало отрезка: ");
        Scanner s1 = new Scanner(System.in);
        double start = s1.nextDouble();
        System.out.print("Введите конец отрезка: ");
        Scanner s2 = new Scanner(System.in);
        double end = s2.nextDouble();
        System.out.print("Введите любую точку: ");
        Scanner s3 = new Scanner(System.in);
        double point = s3.nextDouble();

        if ((point >= start) && (point <= end)) {
            System.out.println("Точка принадлежит отрезку");
        }
        else {
            System.out.println("Точка не принадлежит отрезку");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Хочешь запустить программу? Отвечай только y/n пожалуйста");
            Scanner s4 = new Scanner(System.in);
            String selection = s4.next();
            if (selection.equals("y")) {
                section();
            }
            if (selection.equals("n")) {
                break;
            }
            else {
                System.out.println("Неправильный ответ");
            }
        }
    }
}
