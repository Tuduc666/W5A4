/*
 * 1. Reading a single file - print the lines of the file backwards
 */
package W5A4_Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorldBackwards implements HelloWorldi {

	public static void main(String[] args) {
		  File file = new File(path);    
		  ArrayList<String> lineA = new ArrayList<String>();
		  try {
		   Scanner sc = new Scanner(file);
		   while(sc.hasNextLine()) {
		   String line = sc.nextLine();
		   lineA.add(line);
		   }
		   sc.close();
		  }
		  catch (FileNotFoundException e){
		   System.out.println("File doesn't exist");
		  }
		  
		  for(int i=lineA.size()-1 ; i>=0;i--) {
			   System.out.println(lineA.get(i));
		  }  
	}
}
