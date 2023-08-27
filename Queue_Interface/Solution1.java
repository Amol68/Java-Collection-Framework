import java.util.PriorityQueue;
import java.util.Queue;
class HelloWorld {
    
    
    public static void main(String[] args) {
      
      Queue<Integer> q1 = new PriorityQueue<>();
      q1.offer(48);
      q1.offer(3);
      q1.offer(95);
      q1.offer(6);
      q1.offer(1);
      q1.offer(8);
      System.out.println(q1);
      
      // a min-heap data structur is being implemented under the hood. So , smallest element will have highest priority.
      
      q1.poll();
      System.out.println(q1);
      
      System.out.println(q1.peek());
      
      // to reverse the priority constructor i.e, comparator.reverseOrder() is used. largest element will have highest priority. Now it will work as max-heap
     
      

    }
}
