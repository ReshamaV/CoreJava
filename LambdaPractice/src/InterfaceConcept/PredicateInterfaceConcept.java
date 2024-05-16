package InterfaceConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		
		Predicate<Integer> func=x->x>5;
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//List<Integer> collist=list.stream().filter(func).collect(Collectors.toList());
		//System.out.println(collist);
		
		//Predicate using &&:
		List<Integer> collist1=list.stream().filter(x->x>5 && x<9).collect(Collectors.toList());
		System.out.println(collist1);
		
		//Predicate with negate:
		List<String> namelist= Arrays.asList("Naveen","Navee", "Nav", "Java","Jav","Ja","J");
		Predicate<String> nameExp=x->x.startsWith("Nav");
		List<String> newnameslist=namelist.stream().filter(nameExp.negate()).collect(Collectors.toList());
		System.out.println(newnameslist);
	}

}
