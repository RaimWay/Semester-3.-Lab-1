package test;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.print("Input any number: ");
        Scanner line1 = new Scanner(System.in);
        String s1 = line1.next();

        System.out.print("Input any number: ");
        Scanner line2 = new Scanner(System.in);
        String s2 = line2.next();

        int ix2 = Integer.parseInt(s2);
        double dx2 = Double.parseDouble(s2);

        int ix1 = Integer.parseInt(s1);
        double dx1 = Double.parseDouble(s1);

        int ix = ix1 + ix2;
        double dx = dx1 + dx2;

        System.out.println(ix);
        System.out.println(dx);
    }
}
