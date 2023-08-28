package exceptionHandling;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		String a="Tn07";
		try{
			int b=Integer.parseInt(a);
			System.out.println(b);
		}
		catch(ArithmeticException e) {
			System.out.println("don't convert String to int");
		}
		catch(NullPointerException ne) {
			System.out.println("null point exception");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Number format Exception");
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println("Index out of bound Exception");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("well done");
		}
		
		
		System.out.println("Thank you");
	}

}
