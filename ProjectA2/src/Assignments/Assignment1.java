package Assignments;

//Create class "Student", 2 variables (int age, rollNo), 2 Methods (Display1()-Welcome to all of you, Display2()-Automation is very easy) 
public class Assignment1 {
	
	int age, rollNo;
	
	public void Display1() {
		System.out.println("Welcome to all of you");
	}
	
	public void Display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		Assignment1 a1 = new Assignment1();
		a1.Display1();
		a1.Display2();
		a1.age = 15;
		a1.rollNo = 12;
		System.out.println("Age: " + a1.age);
		System.out.println("Roll No: " + a1.rollNo);
	}
	
}
