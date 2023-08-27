/*A Red-Black tree based NavigableMap implementation.The map is sorted according to the natural ordering of its keys,
or by a Comparator provided at map creation time, depending on which constructor is used.This implementation provides 
guaranteed log(n) time cost for the containsKey, get, put and remove operations. Algorithms are adaptations of those
in Cormen, Leiserson, and Rivest's Introduction to Algorithms. */

import java.util.Map;
import java.util.TreeMap;

class HelloWorld {
    public static void main(String[] args) {
       
       Map<Integer , String> no = new TreeMap<>();
       no.put(1,"one");
       no.put(9,"Nine");
       no.put(2,"Two");
       no.put(3,"Three");
       
       no.remove(1);
       System.out.println(no);
     
    }
}

// All the operations occurs in O(logn)
