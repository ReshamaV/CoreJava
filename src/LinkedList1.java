import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList <String> li=new LinkedList<String>();
     li.add("tree");
     li.add("fruit");
     li.add("fruit");
     li.add("leaves");
  // Collections.sort(li);
     LinkedList<String> l2=new LinkedList<String>(); 
     l2.add("roots");  
     l2.add("plant");  
     li.addAll(l2);
     Collections.sort(li);
     li.remove(2);
     //li.removeAll(l2);
     //li.retainAll(l2);
     System.out.println(li);
     Iterator<String> itr=li.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
