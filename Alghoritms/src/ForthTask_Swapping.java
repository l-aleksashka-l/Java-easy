//Напишите программу на Java, чтобы поменять местами значения, хранящиеся
// в двух переменных, без использования третьей переменной.

import java.util.Scanner;

public class ForthTask_Swapping {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("a = " + a + "; b = "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "; b = " + b);
    }
}
