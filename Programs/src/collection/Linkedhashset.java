package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); 
		 linkedset.add("A"); 
	        linkedset.add("B"); 
	        linkedset.add("C"); 
	        linkedset.add("D"); 
	  
	        System.out.println("Original LinkedHashSet:" + linkedset); 
	        System.out.println("Size of LinkedHashSet = " + linkedset.size()); 
	  
	        // trying to add duplicate 
	        linkedset.add("A"); 
	        System.out.println("After adding duplicate element " + linkedset); 
	        System.out.println("Size of LinkedHashSet = " + linkedset.size()); 
	  
	        // trying to add null value more than one 
	        linkedset.add(null); 
	        linkedset.add(null); 
	        System.out.println("After adding two null element " + linkedset); 
	        System.out.println("Size of LinkedHashSet = " + linkedset.size());
	        
	        LinkedHashSet<String> linkedset1 = new LinkedHashSet<String>(); 
			 linkedset.add("Av"); 
		        linkedset.add("Bc"); 
		        linkedset.add("Cr"); 
		        linkedset.add("Df"); 
		        
		        boolean value 
	            = linkedset.equals(linkedset1); 
		        System.out.println(value);
	}

}
