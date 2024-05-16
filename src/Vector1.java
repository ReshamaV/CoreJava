import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector <Integer> v=new Vector<Integer>();
      v.add(10);
      v.add(20);
      v.add(30);
      v.add(40);
   // Collections.sort(v);
      Vector<Integer> v2=new Vector<Integer>(); 
      v2.add(50);  
      v2.add(80);  
      v.addAll(v2);
      Collections.sort(v);
      v.remove(2);
      //v.removeAll(v2);
      //v.retainAll(v2);
      System.out.println(v);
      Iterator<Integer> itr=v.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
	}

}
