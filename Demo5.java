package exceptionHandling;

public class Demo5 {

	public static void main(String[] args) {
		String[] a = { "Krish", "Mani", "Mathan" };
		try {
			for (int i = 0; i < a.length; i++) {

				System.out.println(a[3]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println("Array Index out bounds Exception");
			ae.printStackTrace();
		}
		System.out.println("Thank You");
	}

}
