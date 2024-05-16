import java.util.*;
class Employee123 //implements Comparable<Employee123>
{
	int id;
	int age;
	float salary;

Employee123(int id,int age,float salary)
{
	this.id=id;
	this.age=age;
	this.salary=salary;
}





@Override
public int hashCode() {
	return Objects.hash(age, id, salary);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee123 other = (Employee123) obj;
	return age == other.age && id == other.id && Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
}






}
public class Employee12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee123 e1=new Employee123(101,25,30000f);
     Employee123 e2=new Employee123(105,20,20000f);
     //e1.equals(e2);
     TreeSet<Employee123> al=new TreeSet<Employee123>(); 

     System.out.println("equals method");
     if(e1.equals(e2))
     {
    	 System.out.println("both are equal");
     }
     else
    	 System.out.println("both are not equal");
     System.out.println("hash code method");
     if(e1.hashCode()==e2.hashCode())
     {
    	 System.out.println("hashcode are same");
     }
     else
     {
    	 System.out.println("hashcode are not same");
     }
    
	}

}


