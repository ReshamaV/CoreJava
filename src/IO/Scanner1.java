package IO;
import java.io.*;  
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner s = null;

	        try {
	            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt")));

	            while (s.hasNext()) {
	                System.out.println(s.next());
	            }
	        } finally {
	            if (s != null) {
	                s.close();
	            }
		
	}

	}
}
