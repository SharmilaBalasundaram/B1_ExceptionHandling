package a1_tryCatchTest;

public class A4_TryCatchTest {
	
	public static void main(String[] args) {
		
		System.out.println("Starting....");
		
		System.out.println("Processing....");
		
		try{
			int i = 1 / 1; // arithmatic

			int[] a = new int[2]; // 0,1 // arrayindexoutbound
			a[0] = 10;
			a[1] = 21;
			//a[2]=10;
		
			String s = null;
			s.concat("Hi");
			
		} catch (ArithmeticException e){
			System.out.println("You have entered incorrect value");
			System.out.println("Log:"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Your limit is exits");
			System.out.println("Log:"+e.getMessage());
		}catch (Exception e){
			System.out.println("something went wrong");
			System.out.println("Log:"+e.getMessage());
		}
		System.out.println("Completed...");
		
	}

}
