package PackageA1;

//constructor is like method
//constructor name and class name will be same
//no return type
//no need to call, constructor will call automatically as we create the object of the class

public class Constructors {

	public Constructors() {
		System.out.println("Default Constructor");
	}
	public Constructors(int a) {
		this(22, 32);//control will go to 2 Parameterized Constructor
		System.out.println("1 Parameterized Constructor");
	}
	public Constructors(int a, int b) {
		this();//control will go to Default Constructor
		System.out.println("2 Parameterized Constructor");
	}
	public static void main(String[] args) {
		Constructors ob = new Constructors();
		//Constructors ob1 = new Constructors(10); //control will go to 1 Parameterized Constructor
		//Constructors ob2 = new Constructors(10, 20);
	}

}