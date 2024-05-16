package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            FileWriter writer = new FileWriter("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
	}

}
