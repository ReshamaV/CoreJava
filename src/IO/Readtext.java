package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileReader reader = new FileReader("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt");
			  //  FileReader reader=new FileReader("Hello.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	 
	            String line;
	 
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
