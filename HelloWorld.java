/*
 * 1. Reading a single file

Create one file on your desktop named hello
Fill the file with two lines:
Hello
World

Create a program to print the lines of the file.

Note: HelloWorldBackwards will print the lines of the file backwards
 */
package W5A4_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld implements HelloWorldi {

	public static void main(String[] args) {
		  File file = new File(path);     
		  try {
		   Scanner sc = new Scanner(file);
		   while(sc.hasNextLine()) {
		   String line = sc.nextLine();
		   System.out.println(line);
		   }
		  }
		  catch (FileNotFoundException e){
		   System.out.println("File doesn't exist");
		  }
	}
}
