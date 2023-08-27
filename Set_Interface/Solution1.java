/* A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.
The Set interface contains only methods inherited from Collection and adds the restriction that duplicate 
elements are prohibited. Set also adds a stronger contract on the behavior of the equals and hashCode operations,
allowing Set instances to be compared meaningfully even if their implementation types differ. Two Set instances are 
equal if they contain the same elements.The Java platform contains three general-purpose Set implementations: 
HashSet, TreeSet, and LinkedHashSet. HashSet, which stores its elements in a hash table, is the best-performing implementation; 
however it makes no guarantees concerning the order of iteration. */


import java.util.HashSet;
class HelloWorld {
    
    
    public static void main(String[] args) {
      
     
      HashSet<Integer> set = new HashSet<>();
      set.add(21);
      set.add(7);
      set.add(89);
      set.add(13);
      System.out.println(set);
      
      set.remove(21);
      System.out.println(set);
      
       System.out.println(set.contains(7));
       
       System.out.println("Is Empty:" +set.isEmpty());
       
       // set.clear() && set
    }
}

// All the operations are executed in O(1) time.

