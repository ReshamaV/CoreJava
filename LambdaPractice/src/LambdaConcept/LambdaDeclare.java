package LambdaConcept;

public class LambdaDeclare {

	public static void main(String[] args) {
		
		
		Webpage w =(String value)-> {System.out.println("Hii " + value);};
		Webpage w1=(value)-> {System.out.println("Hii " +value);};
	    Webpage w2=(value)-> {System.out.println(value.toUpperCase());};
				
						
		w.header("Google");
		w1.header("Facebook");
		w2.header("naveen");

	}

}
