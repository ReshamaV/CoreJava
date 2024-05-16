package SetImplementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(13);
		set.add(15);
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
