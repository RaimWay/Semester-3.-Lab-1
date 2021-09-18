package test3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
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
}
