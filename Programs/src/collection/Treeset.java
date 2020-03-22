package collection;

import java.util.Iterator;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// Tree set: sorts correct order,does not take dublicates and indexing
		
		TreeSet<String> set = new TreeSet<String>(); 

//Elements are added using add() method 
set.add("d");
set.add("b");
set.add("c");
set.add("d"); //// Duplicates will not get insert
set.add("a");
set.add("e"); 

//Elements get stored in default natural 
// Sorting Order(Ascending)
System.out.println(set);

Object[] arr=set.toArray();
for(Object var:arr) {
	System.out.println(var);
}

Iterator<String> itr=set.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}




	}

}
