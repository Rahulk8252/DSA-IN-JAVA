import java.util.*;
public  class Hashmap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        //insert
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us",200);
        System.out.println(hm);

        //Get -0(1)
        int population = hm.get("india");
        System.out.println(population);

        //ContainsKey -O(1)
        System.out.println(hm.containsKey("india")); //true
        System.out.println(hm.containsKey("indonesia")); //false

        //Remove -O(1)
        System.out.println(hm.remove("indonesia"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //IS Empty
        System.out.println(hm.isEmpty());
    }
}
