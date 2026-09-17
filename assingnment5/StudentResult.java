package assingnment5;

class Student {
	
	private int Marks;
	private char Grade;
	
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		this.Grade = grade;
	}
}

public class StudentResult {
	public static void main(String[] Args)
	{
		Student s = new Student();
		
		s.setMarks(300);
		s.setGrade('A');
		
		System.out.println("marks " + s.getMarks());
		System.out.println("grSade "+ s.getGrade());
		
		
	}
}

