//Напишите Java-программу для проверки является ли введенное число - числом Армстронга

import java.util.Scanner;

public class ThirteenthTask_Armstrong {
    static int counter (long number){
        int count = 1;
        while(number>=10){
            number = number/10;
            count++;
        }
        return count;
    }
    static long exponentiation(int count, long number){
        long first = number;
        for(int i = 1; i < count; i++){
            number = number * first;
        }
        return number;
    }
    public static void main(String[] args) {
        long number,sum = 0, numberBuffer;
        int  counter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number!");
        number = scanner.nextLong();
        numberBuffer = number;
        counter = counter(number);
        while(number>=1){
            sum = sum + exponentiation(counter,number%10);
            number = number/10;
        }
        if(sum==numberBuffer)
            System.out.println("Armstrong number!");
        else
            System.out.println("Not Armstrong number!");

        String[] out = new String[0];
        main(out);
    }

}
