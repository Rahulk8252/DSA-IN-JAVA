import java.util.PriorityQueue;
public class heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(9);
        pq.add(7);
    
    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
    }
}
}
