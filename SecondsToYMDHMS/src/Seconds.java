import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                                                   //Ввод с консоли
        System.out.print("Input a number: ");
        int seconds = in.nextInt();
        int minuteC=60, hourC = 3600, dayC=86400, monthC=2592000, yearC = 31536000;                            //Константы
        int year = seconds/yearC;
        int month = (seconds = (seconds-(year*yearC)))/monthC;
        int day = (seconds = (seconds -(month*monthC)))/dayC;
        int hour = (seconds = (seconds -(day*dayC)))/hourC;
        int minute = (seconds = (seconds -(hour*hourC)))/minuteC;
        seconds = (seconds -(minute*minuteC));                                                                 //Подсчет
        System.out.println(year + " year(s) " + month + " month(s) " + day + " day(s) " + hour + " hour(s) " + //Вывод
                minute + " minute(s) " + seconds + " second(s)");
        System.out.println("Year has 365 days; Month has 30 days.");
    }
}
