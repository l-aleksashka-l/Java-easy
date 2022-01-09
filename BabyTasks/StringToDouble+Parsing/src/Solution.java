import java.util.Objects;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        ReciursiaEpta();
        //напишите тут ваш код
    }

    public static void ReciursiaEpta() {
        String stop = "stop";
        String stops = "Stop";
        System.out.println("Enter fractional number: ");
        Scanner scanner = new Scanner(System.in);
        String scanners = scanner.nextLine();

        if(!Objects.equals(scanners, stop) && !Objects.equals(scanners, stops)) {
            try {
                double Double = java.lang.Double.parseDouble(scanners);
                System.out.println("Rounded number: " +  Math.round(Double));
                ReciursiaEpta();
            } catch (Exception e) {
                System.out.println("Exception occurred");
                ReciursiaEpta();
            }
        }
            else
            {
            System.exit(0);
        }
    }
}
