
public class Ex5{

	public static void main(String[] args) {
			String name=null;
			try {
				
			System.out.println("first line");
			System.out.println("lenghth="+name.length());
			System.out.println("last line");
			}
			
			catch(NullPointerException e)
			{
				System.out.println("string is null");
			}
	}

}
