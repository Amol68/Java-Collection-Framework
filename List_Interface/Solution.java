import java.util.*;

class Solution {
    public static void main(String[] args) {
        
        List<String> stdt = new ArrayList<>();
        
        stdt.add("om");  // add element at last
        stdt.add("jay");
        stdt.add(0,"yash"); //add element at specified index
        System.out.println(stdt);
        
        
        // ------> Adding a new list to an existing list -------->
        
        List<String> newlist = new ArrayList<>();
        newlist.add("phil");
        newlist.add("jude");
        
        stdt.addAll(newlist);
        System.out.println(stdt);
        
     // ------> Remove index at an index-------->
     //ewlist.remove( 0);
     // System.out.println(stdt);
    
        stdt.set(1,"arsh");
        System.out.println(stdt);
        
    // ------> Remove index at an index----------->
    Iterator<String> itr = stdt.iterator();
    
    while(itr.hasNext()){
        System.out.println("Value:" +itr.next());
    }
    
    // ------> Time Complexity-------->
     // to remove an element at middle : O(n)
     // 
    
    
    }
}
