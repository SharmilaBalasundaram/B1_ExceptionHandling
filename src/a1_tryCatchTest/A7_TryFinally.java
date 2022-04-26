package a1_tryCatchTest;

public class A7_TryFinally {

	public static void main(String[] args) {

		System.out.println("Starting...");
		System.out.println("Login to DB....");
		System.out.println("Processing....");
		try {
			int i = 1 / 0;
		
		} finally {
			System.out.println("Logout DB");
		}
		System.out.println("Completed");
		
	}
}
