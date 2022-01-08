//Напишите Java-программу, чтобы найти второе по величине число в массиве

import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.TreeSet;

public class TwelfthTask_SecondBiggestNumber {


    static void remove(TreeSet treeSet) {
        treeSet.remove(treeSet.last());
    }

    public static void main(String[] args) {
        int intArray[] = {48, 1, 34, 534, 34, 54, 23, 554, 534, 35, 464, 243};
        int a;
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the number from the end:");

        a = scanner.nextInt();

        for (int i = 0; i < intArray.length; i++)
            treeSet.add(intArray[i]);

        if (a > treeSet.size()) {
            System.out.println("OutOfBoundExeption!");
            String[] am = new String[0];
            main(am);
        }

        for (int i = 1; i < a; i++)
            remove(treeSet);

        System.out.println(treeSet.last());

        String[] am = new String[0];
        main(am);
    }
}
