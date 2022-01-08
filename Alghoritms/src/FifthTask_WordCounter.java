//Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap

import java.util.HashMap;

public class FifthTask_WordCounter {
    public static void main(String[] args) {
        String st = "Cat cat dog cat smth cheetah";
        HashMap <String, Integer> hashMap = new HashMap<String, Integer>();
        String[] strings = st.split(" ");
        for(int i = 0; i < strings.length-1; i++){
            if(hashMap.containsKey(strings[i])){
                int counter = hashMap.get(strings[i]);
                hashMap.put(strings[i], counter + 1);
            }
            else{
                hashMap.put(strings[i], 1);
            }
        }
        System.out.println(hashMap);
    }
}
