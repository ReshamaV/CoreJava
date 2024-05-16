import java.util.*;
public class Linkedhashsetimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>(); 
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		set.add(90);
		set.add(100);
		System.out.println("LinkedHashSet ");
		Iterator<Integer> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
	}
	}
}
