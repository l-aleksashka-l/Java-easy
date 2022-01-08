//Написать программу на Java для вычисления серии чисел Фибоначчи.

import java.util.Scanner;

public class NinthTask_Fibonachi {
    static int fib(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 0, b = 1, count, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count:");
        count = sc.nextInt();
        if (count == 1)
            System.out.println(a);
        else if (count == 2) {
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i < count - 2; i++) {
                temp = b;
                b = fib(a, b);
                a = temp;
                System.out.println(b);
            }
        }
        String[] out = new String[0];
        main(out);
    }
}
