package PackageA1;

public class Methods {

	public int Sum(int a, int b)
	{
		int plus = a+b;
		System.out.println("Sum is "+ plus);
		return plus;
	}
	
	public int Substract(int a, int b)
	{
		int minus = a-b;
		System.out.println("Substraction is "+ minus);

		return minus;
	}
	
	public void Multiplication(int a, int b)
	{
		int multiply = a*b;
		System.out.println("Multiplication is "+ multiply);

	}
	public static void main(String[] args) {
		Methods arith = new Methods();
		int sumResult = arith.Sum(10, 2);
		int subResult = arith.Substract(10, 2);
		arith.Multiplication(sumResult, subResult);
		
	}
	
}