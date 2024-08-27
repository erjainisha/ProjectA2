package PackageA1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("Please enter the value of a: ");
		Scanner ob = new Scanner(System.in);//has a relationship
		//Scanner class is present in Java jar files
		int a = ob.nextInt();
		System.out.println(" Integer value of a: " +a);
		float b = ob.nextFloat();
		System.out.println(" Float value of b: " +b);
		String s = ob.next();
		System.out.println(" String value of s: " +s);
	}

}