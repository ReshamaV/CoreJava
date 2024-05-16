package IO;
import java.io.*;
public class Keyboard {

		public static void main(String args[])throws Exception{
			 PrintWriter out=new PrintWriter(new FileWriter("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"));
			 InputStreamReader kb=new InputStreamReader(System.in);
			 BufferedReader in=new BufferedReader(kb);
			 String line=in.readLine();
			 while (!line.equals("Stop")){
			 out.println(line);
			 line=in.readLine();
			 }
			 in.close();
			 out.close();
			 kb.close();
	}

}
