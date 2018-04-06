package W5A4_Files;

abstract class StudentQ4abs {
	protected String name;
	protected String grade;
	protected String gpa;
    
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
	abstract void getInfo();
}



