package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_LinkedHash_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> HashSet  = new HashSet<String>();
     LinkedHashSet<String> LinkSet  = new LinkedHashSet<>(); 
     TreeSet<String>TreeSet = new TreeSet<>(); 
     
    for(String str: Arrays.asList("aruu","anu","love1","love")) {
    HashSet.add(str); 
    LinkSet.add(str);
    TreeSet.add(str);
    }
 // should be sorted order HashSet 
    // stores element in sorted order 
    System.out.println("HashSet :"+ HashSet); 

    // insertion order or elements LinkedHashSet 
    // storeds elements as insertion 
    System.out.println("LinkedHashSet :" + LinkSet); 

    // should be sorted order TreeSet 
    // stores element in sorted order but in acending
    System.out.println(" TreeSet :" + TreeSet); 
    
    

	}
}
