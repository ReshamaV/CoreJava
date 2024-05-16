package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferedwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 FileOutputStream fout=new FileOutputStream("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="I love flowers.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}

}
