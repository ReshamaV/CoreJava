import java.util.*;
public class Dequeimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque<String>d=new ArrayDeque<String>();
     d.add("Orange");
     d.add("Banana");
     d.add("Mango");
     d.add("Grapes");
     d.add("Apple");
     System.out.println("Deque is "+d);
     d.addFirst("Coconut");
     d.addLast("Pineapple");
     System.out.println("new deque is "+d);
     System.out.println("poll is "+d.poll());
     System.out.println("poll first is "+d.pollFirst());
     System.out.println("poll last is "+d.pollLast());
     System.out.println(d);
     System.out.println("peek is "+d.peek());
     System.out.println("peek first is "+d.peekFirst());
     System.out.println("peek last is "+d.peekLast());
     System.out.println(d);
     System.out.println("with iteration");
     Iterator<String> it=d.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
     System.out.println("with enumeration");
     Enumeration<String> e=Collections.enumeration(d);
     while(e.hasMoreElements())
     {
    	 System.out.println(e.nextElement());
     }
     
     
	}

}
