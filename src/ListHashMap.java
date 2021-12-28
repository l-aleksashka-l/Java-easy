import java.util.*;

public class ListHashMap{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("ананас");
        list.add("яблоко");
        System.out.println("List: " + list);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("яблоко");
        hashSet.add("яблоко");
        hashSet.add("ананас");
        hashSet.add("банан");
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("яблоко");
        linkedHashSet.add("яблоко");
        linkedHashSet.add("ананас");
        linkedHashSet.add("банан");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("яблоко");
        treeSet.add("яблоко");
        treeSet.add("ананас");
        treeSet.add("банан");
        System.out.println("TreeSet: " + treeSet);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("яблоко", 1);
        hashMap.put("яблоко", 2);
        hashMap.put("ананас", 3);
        hashMap.put("банан", 4);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("яблоко", 1);
        linkedHashMap.put("яблоко", 2);
        linkedHashMap.put("ананас", 3);
        linkedHashMap.put("банан", 4);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("яблоко", 1);
        treeMap.put("яблоко", 2);
        treeMap.put("ананас", 3);
        treeMap.put("банан", 4);
        System.out.println("TreeMap: " + treeMap);
    }
}
