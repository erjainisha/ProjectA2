package PackageA1;

public class HasARel1 {

	public void HasARelMethod1() {
		System.out.println("It is a Has A Relationship - method 1");
	}
	public void HasARelMethod2() {
		System.out.println("It is a Has A Relationship - method 2");
	}
	public static void main(String[] args) {
		HasARel1 ob = new HasARel1(); 
		// create object of this class in another class within same or different package
		ob.HasARelMethod1();
	}
}