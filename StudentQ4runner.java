package W5A4_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentQ4runner {
	public static void main(String[] args) {
		final String pathN = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\names.txt";
		final String pathG = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\grades.txt";
		final String pathA = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\gpas.txt";

		// read the names file
		File fileN = new File(pathN);
		ArrayList<String> lineN = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(fileN);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				lineN.add(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		// read the grades file
		File fileG = new File(pathG);
		ArrayList<String> lineG = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(fileG);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				lineG.add(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		// read the gpa file
		File fileA = new File(pathA);
		ArrayList<String> lineA = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(fileA);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				lineA.add(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		// load array of students
		ArrayList<StudentQ4> studentA = new ArrayList<StudentQ4>();
		for (int i = 0; i < lineN.size(); i++) {
			StudentQ4 s = new StudentQ4();
			s.setName(lineN.get(i));
			s.setGrade(lineG.get(i));
			s.setGpa(lineA.get(i));
			studentA.add(s);
		}

		// print info
		for (StudentQ4 p : studentA)
			p.getInfo();
	}
}
