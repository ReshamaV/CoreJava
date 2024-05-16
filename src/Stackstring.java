import java.util.*;
public class Stackstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
    Stack<String> s=new Stack<String>();
    Stack<String>s1=new Stack<String>();
    boolean result = s.empty();
    System.out.println("is Stack empty "+result);
    s.push("A"); s.push("B"); s.push("C"); s.push("D");
    s.push("E"); s.push("F"); s.push("G"); s.push("H");
    s.push("I"); s.push("J"); s.push("K"); s.push("L"); 
    s.push("M"); s.push("N"); s.push("O"); s.push("P");
    System.out.println("Element in Stack" +s);
    for(i=0;i<16;i++)
    {
    	String x=(String)s.pop();
    	s1.push(x);
    }
    System.out.println("elements after pop and after pushing it into another stack");
    System.out.println(s1);
    System.out.println("elememts popped in following orger");
    for(i=0;i<16;i++)
    {
    	String y=(String)s1.pop();
        System.out.println(y);
    }
	}
}

