import java.util.*;
public class Linkedhashex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            LinkedHashSet<Integer> a1 = new LinkedHashSet<>();

            //add() method
            a1.add(11);
            a1.add(22);
            a1.add(33);
            a1.add(44);
            a1.add(55);
            a1.add(66);
            a1.add(77);
            a1.add(88);
            a1.add(99);
            System.out.println("List:" +a1);

            //remove() method
            a1.remove(3);
            System.out.println("After removing element :"+a1);

            //contains() method
            System.out.println("Does list contain '33' ? :"+a1.contains(33));
          //isEmpty() method
            System.out.println("Does list is 'Empty' ? :"+a1.isEmpty());

            //size() method
            System.out.println("Size of an List:"+a1.size());
            System.out.println("Before removing set"+a1);

            LinkedHashSet<Integer> a2 = null;

            a2.add(666);
            a2.add(777);
            a2.add(888);
            a2.add(999);
            System.out.println("Elements removed in set"+a2);

            a1.removeAll(a2);
            System.out.println("After remove all in set"+a1);
        }catch (NullPointerException e){
            System.out.println("exception thrown"+e);
        }

	}

}
