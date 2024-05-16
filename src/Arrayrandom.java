import java.util.*;
public class Arrayrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> li=new ArrayList<Integer>();
    li.add(10);
    li.add(20);
    li.add(30);
    li.add(40);
    li.add(50);
    li.add(60);
    System.out.println("Array Set "+li);
    long startTime = System.nanoTime();
//    System.out.println(startTime);
    System.out.println(li.indexOf(8));
    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println(totalTime);
    HashSet hs=new HashSet();
    hs.addAll(li);
    System.out.println("Hash Set "+hs);
    long startTime1 = System.nanoTime();
    System.out.println(hs.contains(8));
    long endTime1   = System.nanoTime();
    long totalTime1 = endTime1 - startTime1;
    System.out.println(totalTime1);
    for (int i=1;i<=20;i++){
        int random = (int)(Math.random()* (20));
//        a[i]=random;
        System.out.println (random);
    }
    
	}

}
