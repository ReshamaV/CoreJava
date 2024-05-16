import java.util.*;
public class Treesetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
//      boolean add = ts.add(Null);
      try {
          ts.add(null);

      }
     catch (Exception e){
         System.out.println("we can not add Null in Tree Set");
     }
      ts.add("A");
      ts.add("G");
      ts.add("J");
      ts.add("B");
      System.out.println(ts.ceiling("H")); //Just After the given element value
      System.out.println(ts);
      Iterator ir=ts.descendingIterator();
      while (ir.hasNext()){
          System.out.println(ir.next());
      }
      System.out.println(ts.floor("C"));//Just Before the given element value
      System.out.println(ts.higher("A"));
      System.out.println(ts.lower("A"));
	}

}
