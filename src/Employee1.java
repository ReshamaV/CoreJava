import java.util.*;
import java.lang.*;
import java.io.*;
 class Employee11 {
	int id;
	int age;
	float salary;
	Employee11(int id, int age, float salary)
	{
		this.id=id;
		this.age=age;
		this.salary=salary;
	}
}
	class Sortbyage implements Comparator<Employee11>
	{
	public int compare(Employee11 e1,Employee11 e2)
	{
		if(e1.age==e2.age)
		return 0;
		else if(e1.age>e2.age)
			return 1;
		else
			return -1;
	}
	}
	class Sortbysalary implements Comparator<Employee11>
	{
	public int compare(Employee11 e1,Employee11 e2)
	{
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary>e2.salary)
			return 1;
		else
			return -1;
	}
	}

	
    public class Employee1{
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee11> al=new ArrayList<Employee11>();  
		al.add(new Employee11(101,25,25000f));
		al.add(new Employee11(100,23,30000f));
		System.out.println("Sorting by age");
		Collections.sort(al,new Sortbyage());
		for(Employee11 e:al) {
			System.out.println(e.id+" "+e.age+" "+e.salary);
	}
		System.out.println("sorting by salary");
		Collections.sort(al,new Sortbysalary());
		for(Employee11 e:al) {
			System.out.println(e.id+" "+e.age+" "+e.salary);

}
	}
	
	}
	
