import java.util.*;
public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> l1=new LinkedList<String>();
      l1.add("Mango");
      l1.add("Orange");
      l1.add("Grapes");
      l1.add("Banana");
      Iterator itr=l1.iterator();
      while(itr.hasNext())
      {
     System.out.println(itr.next());
      //System.out.println(l1);
      }
      List<Integer>l2=new LinkedList<Integer>();
      l2.add(34);
      l2.add(15);
      l2.add(25);
      l2.add(10);
      l2.remove(2);
      l2.set(2, 67);
      Iterator itr1=l2.iterator();
      while(itr1.hasNext())
      {
    	  System.out.println(itr1.next());
      }
	}

}
