package InterfaceConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> func= x->x*7;
		
		System.out.println(func.apply(2));
		
		Function<Integer, Integer> func1=x->x*10;
		System.out.println(func1.apply(20));
		
		List<String> langlist=new ArrayList<String>();
		langlist.add("Java");
		langlist.add("Python");
		langlist.add("Ruby");
		System.out.println(langlist);
		
		langlist.replaceAll(ele -> ele+ " Naveen");
		System.out.println(langlist);

	}

}
