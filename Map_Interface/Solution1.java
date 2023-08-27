An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface.
The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection
of values, or set of key-value mappings. The order of a map is defined as the order in which the iterators on the map's collection 
views return their elements. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, 
like the HashMap class, do not.

Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null
values and the null key. (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) 
This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.
This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements 
properly among the buckets. Iteration over collection views requires time proportional to the "capacity" of the HashMap instance (the number of buckets)
plus its size (the number of key-value mappings). Thus, it's very important not to set the initial capacity too high (or the load factor too low)
if iteration performance is important.


import java.util.Map;
import java.util.HashMap;

class HelloWorld {
    public static void main(String[] args) {
       
       Map<Integer , String> no = new HashMap<>();
       no.put(1,"one");
       no.put(2,"Two");
       no.put(3,"Three");
       
       System.out.println(no);
       
       if(!no.containsKey("4")){
           no.put(4,"Four");
       }
       
       System.out.println(no);
       
       no.putIfAbsent(5,"Five");
       System.out.println(no);
       
       System.out.println(no.containsValue("Two"));
    }
}
    
