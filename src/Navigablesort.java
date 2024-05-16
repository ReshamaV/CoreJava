import java.util.*;
public class Navigablesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NavigableSet<Integer> ns=new TreeSet<Integer>();
     ns.add(10);
     ns.add(20);
     ns.add(30);
     ns.add(40);
     ns.add(50);
     System.out.println(ns);
     System.out.println(ns.descendingSet());
     System.out.println(ns.floor(38));
     System.out.println(ns.ceiling(38));
     System.out.println(ns.lower(10));
     System.out.println(ns.higher(50));
    // System.out.println(ns.pollFirst());
    System.out.println(ns);
   // System.out.println(ns.pollLast());
    System.out.println(ns);
    System.out.println(ns.tailSet(20, true));
    System.out.println(ns.headSet(30));
    System.out.println(ns.subSet(20, 50));
    System.out.println(ns.contains(25));
    System.out.println(ns.containsAll(ns));
    NavigableSet<Integer> ns1=new TreeSet<Integer>();
    ns1.add(60);
    ns1.add(70);
    ns1.add(80);
    ns1.add(90);
    ns1.add(100);
    ns.addAll(ns1);
    System.out.println(ns);
    try {
    	ns.add(null);
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
    
    
    System.out.println(ns.containsAll(ns1));
    System.out.println(ns);
    Iterator it=ns.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    	Integer str=(Integer)it.next();
    	
    	if(str==50)
    	{
    		it.remove();
    		System.out.println("afetr iteration" +it);
    	}
    	
    	System.out.println(it.next());
    	break;
    }
    
    Enumeration<Integer> e=Collections.enumeration(ns);
    while(e.hasMoreElements())
    {
    	System.out.println(e.nextElement());
    }
	}

}
