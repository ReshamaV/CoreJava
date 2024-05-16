package InterfaceConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorComcrpt {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> func = (x1,x2)-> x1+x2;
		int r=func.apply(10, 20);
		System.out.println(r);
		
		//BiFuction Interface
		
		BiFunction<Integer, Integer,Integer> func2 = (x1,x2)-> x1*x2;
		int res=func2.apply(5, 10);
		System.out.println(res);
		
		

	}

}
