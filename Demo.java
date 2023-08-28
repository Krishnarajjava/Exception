package exceptionHandling;

public class Demo {
	public static void main(String[]args) {
		System.out.println("Welcome");
		int a=10;
		int b=2;
		int c=0;
		try {
		System.out.println(a/c);
		}
		catch(ArithmeticException e) {
			System.out.println("don't try to divide to zero");
		}
		System.out.println(a/b);
		System.out.println("Thank you");
		System.out.println("GitHub");
		
	}

	

}
