package W5A4_Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentQ3runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// prompt user
		System.out.println("Enter student name, grade, GPA.  (each entry separated by a comma)");
		String[] line = sc.nextLine().split(","); // parse the input and store result in String array

		StudentQ3abs s = new StudentQ3();
		s.setName(line[0]);
		s.setGrade(line[1]);
		s.setGpa(line[2]);

		sc.close();

		String pathN = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\names.txt";
		String pathG = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\grades.txt";
		String pathA = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\gpas.txt";

		File fileN = new File(pathN);
		File fileG = new File(pathG);
		File fileA = new File(pathA);
		try {
			// write to file names
			FileWriter writer = new FileWriter(fileN, false);
			writer.write(s.getName());
			writer.close();
			
			// write to file grades
			FileWriter writer1 = new FileWriter(fileG, false);
			writer1.write(s.getGrade());
			writer1.close();
			
			// write to file names
			FileWriter writer11 = new FileWriter(fileA, false);
			writer11.write(s.getGpa());
			writer11.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
