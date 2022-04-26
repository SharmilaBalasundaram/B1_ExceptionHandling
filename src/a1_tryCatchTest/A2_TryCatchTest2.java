package a1_tryCatchTest;

public class A2_TryCatchTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("Starting....");
		
		System.out.println("Processing....");
		
		try{
		int i=1/1;
		int [] a= new int[2]; //0,1
		a[0]=10;
		a[1]=21;
		a[2]=10;
		
		} catch (ArithmeticException e){
			System.out.println("Alert: Sorry your input is wrong");
			System.out.println("Log:"+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Your limit is exits");	
		}
		System.out.println("Completed...");
		
	}

}
