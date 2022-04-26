package a3_throwTest;

public class A1_ThrowTest {

	public static void main(String[] args) throws Exception {
		
		int time=1;
		
		while(true){
			if (time !=11){
			System.out.println("Your idle time is:"+time);
			time++;
			Thread.sleep(1000);
		} else {
			throw new Exception("You are out of time");
			}
		}
	}
}
