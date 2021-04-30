
public class Ex2 {

	public static void main(String[] args) {
		try
		{
			System.out.println("first line");
			System.out.println("result="+15/0);
			System.out.println("last line");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("hello kiran");
		}
		

}
