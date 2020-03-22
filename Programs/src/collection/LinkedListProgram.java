package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram {

	public static void main(String[] args) {
		// 
LinkedList<String> ob=new LinkedList<String>();
ob.addFirst("Love");
ob.add("anu");
ob.add("aru");
ob.add("mom");
ob.add("dad");
ob.addLast("Love");

System.out.println(ob);

ob.forEach(x -> System.out.println(x.contains("a")));


Object[] arr=ob.toArray();
for(Object var:arr) {
	System.out.println(var);
}


ListIterator<String> itr=ob.listIterator();
while(itr.hasNext()) {
	//System.out.println(itr.hasNext());
	System.out.println(itr.next());
}

while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}

	}

}
