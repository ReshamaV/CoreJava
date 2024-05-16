import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack <Integer> s=new Stack<Integer>();
      s.add(5);
      s.add(15);
      s.add(25);
      s.add(35);
   // Collections.sort(s);
      Stack<Integer> s2=new Stack<Integer>(); 
      s2.add(50);  
      s2.add(80);  
      s.addAll(s2);
      Collections.sort(s);
      s.remove(2);
      //s.removeAll(s2);
      //s.retainAll(s2);
      System.out.println(s);
      Iterator<Integer> itr=s.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
	}

}
