import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list=new ArrayList<String>();
      list.add("Ram");
      list.add("Shyam");
      list.add("Neha");
      list.add("Meera");
    // Collections.sort(list);
      ArrayList<String> al2=new ArrayList<String>(); 
      al2.add("Manu");  
      al2.add("Harish");  
      list.addAll(al2);
      Collections.sort(list);
      list.remove(2);
      //list.removeAll(al2);
      //list.retainAll(al2);
      System.out.println(list);
      Iterator<String> itr=list.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
    	  list.add("Human");
    	  
      }
	}

}
