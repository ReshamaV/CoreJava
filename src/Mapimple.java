import java.util.*;
public class Mapimple {

	public static void main(String[] args) {
		// HashMap
		Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Pune");
        map.put(2,"Banglore");
        map.put(4,"Mumbai");
        map.putIfAbsent(5,"Nashik");
        System.out.println(map.keySet());
        map.remove(2);
        map.replace(4, "Delhi");
        System.out.println(map);
        Set set=map.entrySet();  
        Iterator ir=set.iterator();
        while (ir.hasNext()){
            Map.Entry me=(Map.Entry)ir.next();
            System.out.println(me.getKey()+" "+ me.getValue());
        }
        //LinkedHash map
        Map<Integer,String>lhm=new LinkedHashMap<Integer,String>();
        lhm.put(101,"Banana");
        lhm.put(102,"Mango");
        lhm.put(103,"Orange");
        lhm.put(104,"Apple");
        lhm.put(105, "Grapes");
        System.out.println(lhm.keySet());
        lhm.remove(102);
        lhm.replace(104, "Delhi");
        System.out.println(lhm);
        Set set1=lhm.entrySet();  
        Iterator itr=set1.iterator();
        while (itr.hasNext()){
            Map.Entry le=(Map.Entry)itr.next();
            System.out.println(le.getKey()+" "+ le.getValue());
        }
        //Tree Map
        Map<Integer,String>tm=new TreeMap <Integer,String>();
        tm.put(10,"Sky");
        tm.put(20, "birds");
        tm.put(30, "Tree");
        tm.put(40,"Roots");
        tm.put(50, "Leaves");
        System.out.println(tm.keySet());
        tm.remove(20);
        tm.replace(40, "Delhi");
        System.out.println(tm);
        Set set2=tm.entrySet();  
        Iterator i=set2.iterator();
        while (i.hasNext()){
            Map.Entry te=(Map.Entry)i.next();
            System.out.println(te.getKey()+" "+ te.getValue());
        }
	}

}
