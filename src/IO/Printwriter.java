package IO;

import java.io.File;

import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 PrintWriter writer = new PrintWriter(System.out);    
	      writer.write("Flowers are very beautiful.");        
	 writer.flush();  
	      writer.close();  
	       
	      PrintWriter writer1 =null;      
	         writer1 = new PrintWriter(new File("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"));  
	         writer1.write("Rose,Lily,Lotus,Hibiscus,etc.");                                                   
	                         writer1.flush();  
	         writer1.close();  
	    }  
	}


