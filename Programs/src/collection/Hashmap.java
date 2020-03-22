package collection;

import java.util.HashMap;
import java.util.Iterator;


public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* This is how to declare HashMap */
        HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
  
        /*Adding elements to HashMap*/
        hm.put(12, "geeks"); 
        hm.put(2, "practice"); 
        hm.put(7, "contribute"); 
  
        System.out.println("\nHashMap object output :\n\n" + hm); 
  
        // store data with duplicate key 
        hm.put(12, "geeks"); 
  
        System.out.println("\nAfter inserting duplicate key :\n\n" + hm); 
        
      for(Integer v:hm.keySet()) {//if you want only keys
    	  System.out.println(v);
      }
      
      for(String s:hm.values()) {//if for only values
    	  System.out.println(s);
    	  
      }

	}

}
