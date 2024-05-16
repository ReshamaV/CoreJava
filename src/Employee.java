import java.util.*;
public class Employee implements Comparable<Employee> {
	int id;
	int age;
	float salary;
	Employee(int id,int age,float salary)
	{
		this.id=id;
		this.age=age;
		this.salary=salary;
	}
    public int compareTo(Employee e)
    {
    	if(age==e.age)
    	return 0;
    	else if(age>e.age)
    		return 1;
    	else
    		return -1;
    }
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,25,25000f));
		al.add(new Employee(100,23,30000f));
		//al.compareTo();
		Collections.sort(al);
		for(Employee e:al) {
			System.out.println(e.id+" "+e.age+" "+e.salary);
		}
		
	}

}
