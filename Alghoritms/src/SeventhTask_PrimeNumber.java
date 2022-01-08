//Напишите программу на Java, чтобы узнать, является ли число простым или нет

import java.util.Scanner;

public class SeventhTask_PrimeNumber {
    static String check(int a){
        for (int i = 2; i<=a/2; i++){
            if(a%i==0){
                return "Not prime!";
            }
        }
        return "Prime!";
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        a = sc.nextInt();
        System.out.println(check(a));
        String[] out = new String[0];
        main(out);
    }
}
