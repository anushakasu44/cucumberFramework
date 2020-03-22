package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListProgram {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	ArrayList<String> list=new ArrayList<String>();
	list.add("anu");
	list.add("aruu");
	list.add("priya");
	list.add("ash");
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(2));
	
	list.remove(3);
	System.out.println(list);
	
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("deepu");
	list1.add("munny");
	
	System.out.println(list1.size());
	list.forEach(x -> System.out.println(x.contains("a")));
	
	Object[] arr=list.toArray();
	System.out.println(arr);
	list.set(2, "test");
	
	
	
	for(String li:list1) {
		System.out.println(li);
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
		}	
	


