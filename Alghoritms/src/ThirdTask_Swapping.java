//Напишите программу на Java для того, чтобы поменять местами значения,
// хранящиеся в двух переменных с помощью третьей переменной

public class ThirdTask_Swapping {
    public static void main(String[] args) {
        int a,b, temp;
        a = 1;
        b = 2;
        System.out.println(a + "" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "" + b);
    }
}
