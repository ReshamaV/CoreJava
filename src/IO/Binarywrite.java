package IO;

import java.io.FileOutputStream;

public class Binarywrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");    
             String s="Be always happy.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
            	System.out.println(e);
            	}    
	}

}
