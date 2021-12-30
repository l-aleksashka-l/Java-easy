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

       /* Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        SortedMap sortedMap = new TreeMap(comparator)
        */
        SortedMap sortedMap = new TreeMap();
        sortedMap.put("a", "one");
        sortedMap.put("b", "two");
        sortedMap.put("c", "three");
        sortedMap.put("d", "four");

        System.out.println("SortedMap: " + sortedMap);
        System.out.println("First key: " + sortedMap.firstKey());
        System.out.println("Last key: " + sortedMap.lastKey());
        System.out.println(sortedMap.headMap("b"));
        System.out.println(sortedMap.tailMap("c"));
        System.out.println(sortedMap.subMap("b", "c"));
    }
}
