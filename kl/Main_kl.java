package kl;

import java.util.Scanner;

public class Main_kl {
    static void add() {
        System.out.print("Input any number: ");
        Scanner a1 = new Scanner(System.in);
        double a_1 = a1.nextDouble();

        System.out.print("Input any number: ");
        Scanner a2 = new Scanner(System.in);
        double a_2 = a2.nextDouble();

        double a3 = a_1 + a_2;
        System.out.print("Result: ");
        System.out.println(a3);

    }
    static void sub() {
        System.out.print("Input any number: ");
        Scanner s1 = new Scanner(System.in);
        double s_1 = s1.nextDouble();

        System.out.print("Input any number: ");
        Scanner s2 = new Scanner(System.in);
        double s_2 = s2.nextDouble();

        double s3 = s_1 - s_2;
        System.out.print("Result: ");
        System.out.println(s3);
    }
    static void mul() {
        System.out.print("Input any number: ");
        Scanner m1 = new Scanner(System.in);
        double m_1 = m1.nextDouble();

        System.out.print("Input any number: ");
        Scanner m2 = new Scanner(System.in);
        double m_2 = m2.nextDouble();

        double m3 = m_1 * m_2;
        System.out.print("Result: ");
        System.out.println(m3);
    }
    static void dev() {
        System.out.print("Input any number: ");
        Scanner d1 = new Scanner(System.in);
        double d_1 = d1.nextDouble();

        System.out.print("Input any number: ");
        Scanner d2 = new Scanner(System.in);
        double d_2 = d2.nextDouble();

        double d3 = d_1 / d_2;
        System.out.print("Result: ");
        System.out.println(d3);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите действие. Введите 0 для выхода, 1 для сложения, 2 для вычитания, 3 для умножения, 4 для деления ");
            Scanner s = new Scanner(System.in);
            int selection = s.nextInt();
            if (selection == 0) {
                break;
            }
            if (selection == 1) {
                add();
            }
            if (selection == 2) {
                sub();
            }
            if (selection == 3) {
                mul();
            }
            if (selection == 4) {
                dev();
            }
            else {
                System.out.println("Неправильный вывод");
            }
        }
    }
}
