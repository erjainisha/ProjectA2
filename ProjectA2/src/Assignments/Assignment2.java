package Assignments;
//Question - (((((10+2)*2)-2)*2)/2)
public class Assignment2 {
	
	public int Sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum Result " + c);
		return c;
	}
	public int Multiplty(int a, int b) {
		int c=a*b;
		System.out.println("Multiply Result " + c);
		return c;
	}
	public int Minus(int a, int b) {
		int c=a-b;
		System.out.println("Minus Result " + c);
		return c;
	}
	public void Divide(int a, int b) {
		int c=a/b;
		System.out.println("Divide Result " + c);
	}
	public static void main(String[] args) {
		Assignment2 a2 = new Assignment2();
		int add = a2.Sum(10, 2);
		int multi = a2.Multiplty(add,2);
		int minus = a2.Minus(multi, 2);
		multi = a2.Multiplty(minus,2);
		a2.Divide(multi, 2);
	}
	
}
