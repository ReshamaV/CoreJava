package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bufferedread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);} 
	}

}
