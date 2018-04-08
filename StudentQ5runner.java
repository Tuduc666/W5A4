/*
 * 5. There has to be a better way
		Instead of storing your student information in three seperate files,
			let's try storing them in one.
 */

package W5A4_Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentQ5runner {

	public static void main(String[] args) {
		final String pathN = "C:\\Users\\Tam Uduc\\Documents\\tempJavaData\\namesCombo.csv";

		// read the combo file
		File fileN = new File(pathN);
		ArrayList<StudentQ4> studentA = new ArrayList<StudentQ4>();
		try {
			Scanner sc = new Scanner(fileN);
			while (sc.hasNextLine()) {
				String line[] = sc.nextLine().split(",");
				studentA.add(new StudentQ4(line[0],line[1],line[2]));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		// print info
		for (StudentQ4 p : studentA)
			p.getInfo();
	}
}