package W5A4_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class multipleFilesQ2 implements multipleFilesQ2i {

	public static void main(String[] args) {
		// read the course code file
		File file = new File(pathCode);
		ArrayList<String> lineC = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				lineC.add(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		// read the course name file
		file = new File(pathName);
		ArrayList<String> lineN = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				lineN.add(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		for (int i=0; i<lineC.size(); i++) {
			System.out.println(lineC.get(i)+ " - " + lineN.get(i));
		}
	}
}
