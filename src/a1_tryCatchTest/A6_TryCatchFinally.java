package a1_tryCatchTest;

public class A6_TryCatchFinally {

	public static void main(String[] args) {

		System.out.println("Starting...");
		System.out.println("Login to DB....");
		System.out.println("Processing....");
		try {
			int i = 1 / 1;
		} catch (ArithmeticException e) {
			System.out.println("Your input is invalid");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Logout DB");
		}
		System.out.println("Completed");

	}
}
