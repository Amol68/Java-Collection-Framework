/* A linear collection that supports element insertion and removal at both ends.The name deque is short 
for "double ended queue" and is usually pronounced "deck". Most Deque implementations place no fixed limits
on the number of elements they may contain, but this interface supports capacity-restricted deques as well as
those with no fixed size limit. This interface defines methods to access the elements at both ends of the deque.
Methods are provided to insert, remove, and examine the element. Each of these methods exists in two forms: one
throws an exception if the operation fails, the other returns a special value (either null or false, depending on 
the operation). The latter form of the insert operation is designed specifically for use with capacity-restricted
Deque implementations; in most implementations, insert operations cannot fail. */

import java.util.ArrayDeque;
import java.util.Deque;

class HelloWorld {
    public static void main(String[] args) {
       
       Deque<Integer> d = new ArrayDeque<>();
       
       d.add(2);
       d.add(3);
       d.addFirst(1);
       d.addLast(4);
       System.out.println(d);
       
       d.removeLast();
        System.out.println(d);
        
    }
    
}
