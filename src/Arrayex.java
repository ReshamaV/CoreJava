import java.util.*;
public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashSet<String> s=new LinkedHashSet<String>();
     try {
    	 s.remove(s);
     }
     catch(Exception e)
     {
    	 System.out.println("Set is empty");
     }
     finally
     {
    	 System.out.println("absd");
     }
     
	}

}
