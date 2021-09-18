package test2;

import java.util.Scanner;

public class Main2 {
    static void cube() {
        System.out.print("Input parallelogram width: ");
        Scanner s1 = new Scanner(System.in);
        double cube_width = s1.nextDouble();
        System.out.print("Input parallelogram length: ");
        Scanner s2 = new Scanner(System.in);
        double cube_length = s2.nextDouble();
        System.out.print("Input parallelogram high: ");
        Scanner s3 = new Scanner(System.in);
        double cube_high = s3.nextDouble();
        double cube_volume = cube_high * cube_width * cube_length;
        System.out.print("Parallelogram volume: ");
        System.out.println(cube_volume);
    }

    static void sphere() {
        System.out.print("Input sphere radius: ");
        Scanner s4 = new Scanner(System.in);
        double sphere_r = s4.nextDouble();
        double sphere_volume = 4.0/3 * Math.PI * sphere_r * sphere_r * sphere_r;
        System.out.print("Sphere volume: ");
        System.out.println(sphere_volume);
    }

    static void cylinder() {
        System.out.print("Input cylinder radius: ");
        Scanner s5 = new Scanner(System.in);
        double cylinder_r = s5.nextDouble();
        System.out.print("Input cylinder high: ");
        Scanner s6 = new Scanner(System.in);
        double cylinder_h = s6.nextDouble();
        double cylinder_volume = cylinder_r * cylinder_r * cylinder_h * Math.PI;
        System.out.print("Cylinder volume: ");
        System.out.println(cylinder_volume);
    }

    public static void main(String[] args) {
        System.out.println("To find parallelogram volume type 0\nTo find sphere volume type 1\nTo find cylinder volume type 2");
        Scanner s9 = new Scanner(System.in);
        int select = s9.nextInt();
        if (select == 0) {
            cube();
        }
        if (select == 1) {
            sphere();
        }
        if (select == 2) {
            cylinder();
        }
        else {
            System.out.println("Неправильный ввод");
        }
    }
}
