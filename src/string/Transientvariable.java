package string;
import java.io.*;
public class Transientvariable implements Serializable {
    int id;
    transient int age;
    Transientvariable(int id,int age)
    {
    	this.id=id;
    	this.age=age;
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Transientvariable tv=new Transientvariable(1002,24);
    FileOutputStream f=new FileOutputStream("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");
    ObjectOutputStream o=new ObjectOutputStream(f);
    o.writeObject(tv);
    o.flush();
    o.close();
    System.out.println("Printing the transient variable in file");
    ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"));    
    Transientvariable tv1=(Transientvariable)in.readObject();
    System.out.println("Data in file: "+tv1.id+" "+tv1.age);
    }

}
