import java.util.*;
public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer [] A= {64,28,10,45,73};
     Integer [] B= {50,64,39,10,284,186,73};
     
     Set<Integer>s1=new HashSet<Integer>();
     s1.addAll(Arrays.asList(A));
     
    Set s3=new HashSet();
     try {
    	// s3.remove(s3);
    	// System.out.println(s3);
    	 if(s3.isEmpty()){
             throw new Exception();
    	 }
     }
     catch(Exception e)
     {
    	 System.out.println("Set is empty");
     }
     //s1.addAll(Arrays.asList(A));
     
     Set<Integer>s2=new HashSet<Integer>();
     s2.addAll(Arrays.asList(B));
     
     Set<Integer> all_values=new HashSet<>(s1);
     all_values.addAll(s2);
     System.out.println(all_values);
     
     Set<Integer> dupl_values=new HashSet<>(s1);
     dupl_values.retainAll(s2);
     System.out.println(dupl_values);
     
     Set<Integer> differ_values=new HashSet<>(s1);
     differ_values.removeAll(s2);
     System.out.println(differ_values);
     
     System.out.println(s1.contains(7));//Element is present or not
     System.out.println(s1.isEmpty());
     Iterator ir=s1.iterator();
     while (ir.hasNext()){
         System.out.println(ir.next());
     }
	}

}
