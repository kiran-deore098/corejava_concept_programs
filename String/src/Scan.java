import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name and age");
		
		String name=sc.next();
		int age=sc.nextInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		

	}

}
