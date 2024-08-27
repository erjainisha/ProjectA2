package Assignments;

//Question - (((((10/2)-2)*2)-2)+2)
public class Assignment3 {
	
	public int Divide(int a, int b) {
		int c=a/b;
		System.out.println("Divide Result " + c);
		return c;
	}
	public int Minus(int a, int b) {
		int c=a-b;
		System.out.println("Minus Result " + c);
		return c;
	}
	public int Multiplty(int a, int b) {
		int c=a*b;
		System.out.println("Multiply Result " + c);
		return c;
	}
	public void Sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum Result " + c);
	}
	
	public static void main(String[] args) {
		Assignment3 a3 = new Assignment3();
		int divide = a3.Divide(10, 2);
		int minus = a3.Minus(divide, 2);
		int multi = a3.Multiplty(minus,2);
		minus = a3.Minus(multi,2);
		a3.Sum(minus, 2);
		}
}
