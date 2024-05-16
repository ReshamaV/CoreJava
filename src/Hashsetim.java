import java.util.HashSet;
import java.util.Iterator;

public class Hashsetim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();  
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(16);
		set.add(17);
		set.add(18);
		set.add(19);
		set.add(20);
		System.out.println("Hashset ");
		Iterator<Integer> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
	}

}
}
