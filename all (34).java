import java.util.*;
public class Main {
    public static void main (String[] args) {
    List<String>list=new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Guava");
    System.out.println("ArrayList="+list);
    
    Set<String>set=new HashSet<>();
    set.add("Tea");
    set.add("Coffee");
    set.add("Tea");
    System.out.println("Hashset="+set);
    
    Map<String,Integer>map=new HashMap<>();
    map.put("hello",5);
    map.put("Howareyou",8);
    map.put("fine",10);
    System.out.println("Hashmap"+map);
}
}
