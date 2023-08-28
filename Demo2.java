package exceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		String a=null;
		try{
			System.out.println(a.toUpperCase());
		}
		catch(NullPointerException ae) {
			System.out.println("don't use null value");
		}
		finally {
			
		System.out.println("Thank you");
		}

	}

}
