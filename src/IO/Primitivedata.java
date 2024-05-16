package IO;

import java.io.*;

public class Primitivedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"));
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(202);
        oos.writeDouble(17.25);
        oos.writeChar('R');
        oos.writeBoolean(false);
        System.out.println("  Successfully write  ");
        oos.close();
        fos.close();
        FileInputStream fis1=new FileInputStream(new File("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"));
        ObjectInputStream oos1=new ObjectInputStream(fis1);
        System.out.println("  Successfully read  ");
        int a= oos1.readInt();
        System.out.println("Integer :"+a);
        double b=oos1.readDouble();
        System.out.println("Double :"+b);
        char c=oos1.readChar();
        System.out.println("char :"+c);
        boolean d=oos1.readBoolean();
        System.out.println("Boolean :"+d);
        oos1.close();
    }
	}


