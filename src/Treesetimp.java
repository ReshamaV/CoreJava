import java.util.*;
public class Treesetimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set=new TreeSet<Integer>(); 
		 set.add(21);
		 set.add(22);
		 set.add(23);
		 set.add(24);
		 set.add(25);
		 set.add(26);
		 set.add(27);
		 set.add(28);
		 set.add(29);
		 set.add(30);
		 System.out.println("Treeset ");
		 Iterator<Integer> itr=set.iterator();  
		 while(itr.hasNext()){  
		 System.out.println(itr.next()); 
		 
		 } 
	}

}
