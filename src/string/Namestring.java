package string;

public class Namestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name="Promil";
        String last_name="Jain";

        String name= first_name+" "+last_name;
        System.out.println("Full Name :"+name);
        String extract=name.substring(7,11);
        System.out.println("Last name:"+extract);
	}

}
