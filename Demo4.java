package exceptionHandling;

public class Demo4 {

	public static void main(String[] args) {
		String a="Krish";
		try{
			System.out.println(a.charAt(6));
		
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("Thank you");

	}

}
