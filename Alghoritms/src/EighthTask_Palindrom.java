//Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет

import java.util.Locale;
import java.util.Scanner;

public class EighthTask_Palindrom {
    static boolean checkParity(String[] symbols){
        if((symbols.length)%2==0) return true;
        return false;
    }
    public static void main(String[] args) {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        st = sc.nextLine();
        String s = st.replaceAll(" ", "");
        s = s.replaceAll("!", "");
        s = s.toLowerCase(Locale.ROOT);
        String[] symbols = s.split("");
        if(checkParity(symbols)){
            int temp = 1;
            for(int i = 0; i <= (symbols.length-temp)/2; i++){
                if(!symbols[i].equals(symbols[symbols.length - temp])){
                    System.out.println("Not palindrom!");
                    return;
                }

                temp++;
            }
            System.out.println("Palindrom!");
        }else{
            int temp = 1;
            for(int i = 0; i <= (symbols.length-temp-1)/2; i++){
                if(!symbols[i].equals(symbols[symbols.length - temp])){
                    System.out.println("Not palindrom!");
                    return;
                }

                temp++;
            }
            System.out.println("Palindrom!");
        }
    }
}
