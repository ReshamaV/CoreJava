import java.util.*;
public class Arrayset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> s1 = new ArrayList<Integer>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);

        System.out.println("Element before iterating"+s1);
        Iterator <Integer> it=s1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Element before Enumeration"+s1);

        Enumeration en = Collections.enumeration(s1);
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
	
	

        HashSet<String> s2= new HashSet<String>();

        s2.add("Building");
        s2.add("Cement");
        s2.add("Sand");
        s2.add("Bricks");
        s2.add("Wall");

        System.out.println("Element before iterating"+s2);
        Iterator <String> itr =s2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Element before Enumeration"+s2);

        Enumeration ene = Collections.enumeration(s2);
        while(ene.hasMoreElements()){
            System.out.println(ene.nextElement());
        }
        TreeSet<String> s3= new TreeSet<String>();

        s3.add("Sugar");
        s3.add("Sweet");
        s3.add("Sour");
        s3.add("Salt");
        s3.add("paste");
        System.out.println("Element before iterating"+s3);
        for (String s : s3) {
            System.out.println(s);
        }

        System.out.println("Element before Enumeration"+s3);

        Enumeration<String> enee = Collections.enumeration(s3);
        while(enee.hasMoreElements()){
            System.out.println(enee.nextElement());
        }
	}

}
