
public class Ex6{

	public static void main(String[] args) {
			String name=null;
			try {
			System.out.println("result="+15/0);
			System.out.println("first line");
			System.out.println("lenghth="+name.length());
			System.out.println("last line");
			}
			
			catch(ArithmeticException e)
			{
				System.out.println(e.hashCode());
			}
			catch(NullPointerException e)
			{
				System.out.println("string is null");
			}
			System.out.println("hello kiran");
	}

}
