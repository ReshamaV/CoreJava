package string;

public class Employeeobj {
	
    int id;
    String name;
    float salary;
    Employeeobj(int id,String name,float salary)
    {
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method 
    Employeeobj e=new Employeeobj(101,"John",25000f);
    System.out.println(e);
    System.out.println(e.toString());
}
}