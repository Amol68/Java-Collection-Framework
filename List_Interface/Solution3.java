package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue_demo {

	public static void main(String args[])
    {
		Queue<Integer> q = new LinkedList<>(); // linked-list implements queue interface
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
    }
	
}
