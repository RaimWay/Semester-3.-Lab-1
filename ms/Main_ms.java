package ms;

import java.util.Scanner;

public class Main_ms {
    public static void main(String[] args) {
        String[] names = {"Masha", "Dima", "Greg", "Lisa", "Roma", "Max", "Egor"};
        System.out.print("Введите имя: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        int s1 = 0;


        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                s1 = 1;
            }
        }
        if (s1 == 1) {
            System.out.println("Имя есть в списке");
        }
        else {
            System.out.println("Имени в списке нет");
        }
    }
}
