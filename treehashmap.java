
import java.util.*;
public class treehashmap {
    public static void main(String[] args) {
     TreeMap<String,Integer> tm=new TreeMap<>();
     tm.put("india", 100);
      tm.put("china", 150);
      tm.put("us", 200);

      HashMap<String,Integer> hm=new HashMap<>();
      hm.put("india", 100);
      hm.put("china", 150);
      hm.put("us", 200);
      System.out.println(tm);
      System.out.println(hm);
    }
}
