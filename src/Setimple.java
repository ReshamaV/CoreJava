import java.util.*;
public class Setimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  set.remove("Ajay");  
          System.out.println("After invoking remove(object) method: "+set); 
          HashSet<String> set1=new HashSet<String>();  
          set1.add("Ajay");  
          set1.add("Gaurav");  
          set.addAll(set1);  
          System.out.println("Updated List: "+set);
		   
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
	}
		  LinkedHashSet<String> set11=new LinkedHashSet<String>();  
          set11.add("One");    
          set11.add("Two");    
          set11.add("Three");   
          set11.add("Four");  
          set11.add("Five");  
          Iterator<String> i=set11.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
          TreeSet<Integer> set111=new TreeSet<Integer>();  
          set111.add(24);  
          set111.add(66);  
          set111.add(12);  
          set111.add(15);  
          System.out.println("Highest Value: "+set111.pollFirst());  
          System.out.println("Lowest Value: "+set111.pollLast()); 
	}
}
