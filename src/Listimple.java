import java.util.*;

public class Listimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //ArrayList
		ArrayList<String> a=new ArrayList<String>();
		a.add("Sky");
		a.add("Tree");
		a.add("Birds");
		a.add("Animal");
		//for(String name:a)
		System.out.println(a);
		a.remove(1);
		a.add(1,"Plant");
		//System.out.println(a);
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
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
		
	      Vector <Integer> v=new Vector<Integer>();
          v.add(10);
          v.add(20);
          v.add(30);
          v.add(40);
          Iterator<Integer> itr=v.iterator();
          while(itr.hasNext())
          {
  	      System.out.println(itr.next());
          }
          Stack <Integer> s=new Stack<Integer>();
          s.add(5);
          s.add(15);
          s.add(25);
          s.add(35);
          Iterator<Integer> i=s.iterator();
          while(i.hasNext())
          {
        	  System.out.println(i.next());
          }
	}

}
