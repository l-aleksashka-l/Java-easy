//Напишите программу на Java, чтобы найти повторяющиеся символы в строке.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EleventhTask_FindTwins {
    public static void main(String[] args) {
        String string;
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        string = scanner.nextLine();
        string = string.replaceAll(" ", "");
        String[] strings = string.split("");
        for (int i = 0; i < strings.length - 1; i++) {
            if (hashMap.containsKey(strings[i])) {
                int counter = hashMap.get(strings[i]);
                hashMap.put(strings[i], counter + 1);
            } else {
                hashMap.put(strings[i], 1);
            }
        }

        for (Map.Entry<String, Integer> set: hashMap.entrySet()){
            if (set.getValue() != 1) {
                System.out.println(set.getKey() + " replays " + set.getValue() + " times!");
            }
        }

    }
}
