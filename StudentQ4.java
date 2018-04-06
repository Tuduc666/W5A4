package W5A4_Files;

public class StudentQ4 extends StudentQ4abs {
	public StudentQ4() {} ;                                    // constructor
	public StudentQ4(String name, String grade, String gpa) {     // constructor
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	public void getInfo() {
		System.out.println("My name is " + name + ". I'm in grade " + grade + " and I have a " + gpa + " GPA.");
	}
}
