package a1_tryCatchTest;

public class A1_TryCatchTest {
	
	public static void main(String[] args) {
		
		System.out.println("Starting....");
		
		System.out.println("Processing....");
		
		try{
		int i=1/0;
		} catch (ArithmeticException e){
			System.out.println("Alert: Sorry your input is wrong");
			System.out.println("Log:"+e.getMessage());
		}
		System.out.println("Completed...");
		
	}

}
