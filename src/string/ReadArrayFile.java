package string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadArrayFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        List<String> lines = Collections.emptyList();
        try {
            lines= Files.readAllLines(Paths.get("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt"), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Content of List : ");
        System.out.println(lines);


        BufferedReader br = new BufferedReader((new FileReader("C:\\Users\\ReshamaV\\OneDrive\\Desktop\\Java Program\\Hello.txt")));
        ArrayList<String> listoflines = new ArrayList<>();

        String line = br.readLine();
        while (line != null) {
                listoflines.add(line);
                line = br.readLine();
            }
            br.close();
            System.out.println("Content of ArrayList : ");
            System.out.println(listoflines);

	}

}
