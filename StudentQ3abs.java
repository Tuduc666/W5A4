package W5A4_Files;

abstract class StudentQ3abs {
	protected String name;
	protected String grade;
	protected String gpa;
	
    final String pathNames = "C:\\Users\\Students\\Desktop\\names.txt"; 
    final String pathGrades = "C:\\Users\\Students\\Desktop\\grades.txt"; 
    final String pathGpas = "C:\\Users\\Students\\Desktop\\gpas.txt"; 
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGpa() {
		return gpa; 
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
}

