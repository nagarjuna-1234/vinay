package ExceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		try {
			int a = 5/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("test is running even after exception");
	}

}
