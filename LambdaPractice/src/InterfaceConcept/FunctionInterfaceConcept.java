package InterfaceConcept;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();
		
		int len=func.apply("I am learning Java 8 and java");
		System.out.println(len);
		
		//chaining function
		 Function<Integer, Integer> func2 = x -> x*2;
		 int res=func.andThen(func2).apply("This is awsome");
		 System.out.println(res);

	}

}
