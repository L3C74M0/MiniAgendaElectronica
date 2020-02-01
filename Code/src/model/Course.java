package model;

public class Course {

	private String subject;
	private String teacherName;
	private int courseNumber;
	private String nrc;
	private int credits;
	private int studentsAmount;
		
	public Course(String subject, String teacherName, int courseNumber, String nrc, int credits, int studentsAmount) {
		super();
		this.subject = subject;
		this.teacherName = teacherName;
		this.courseNumber = courseNumber;
		this.nrc = nrc;
		this.setCredits(credits);
		this.setStudentsAmount(studentsAmount);
	}
		
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getnrc() {
		return nrc;
	}

	public void setnrc(String nrc) {
		this.nrc = nrc;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getStudentsAmount() {
		return studentsAmount;
	}

	public void setStudentsAmount(int studentsAmount) {
		this.studentsAmount = studentsAmount;
	}
	
	
	
}
