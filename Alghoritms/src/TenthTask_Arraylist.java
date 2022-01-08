//Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.

import java.util.ArrayList;
import java.util.Iterator;

public class TenthTask_Arraylist {
    public static void for1(ArrayList arrayList){
        System.out.println("1. For");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    public static void while1(ArrayList arrayList){
        System.out.println("2. While");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void for2(ArrayList arrayList) {
        System.out.println("3.For (high level)");
        for(Object o: arrayList){
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("Little");
        arrayList.add("World");
        for1(arrayList);
        while1(arrayList);
        for2(arrayList);
    }
}
