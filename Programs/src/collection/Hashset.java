package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>(); 
        // Adding elements to the HashSet 
        hs.add("geeks"); 
        hs.add("practice"); 
        hs.add("contribute"); 
        System.out.println("Before adding duplicate values \n\n" + hs); 
  
        // Addition of duplicate elements 
        hs.add("geeks"); 
        hs.add("practice"); 
  
        System.out.println("\nAfter adding duplicate values \n\n" + hs); 
  
        // Addition of null values 
        hs.add(null); 
        hs.add(null); 
  
        // Displaying HashSet elements 
        System.out.println("\nAfter adding null values \n\n" + hs);
	
	Iterator<String> itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
