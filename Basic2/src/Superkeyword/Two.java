package Superkeyword;

public class Two extends One{
	int num1;
	public Two()
	{
		System.out.println("child class");
		
	}
	
	public void f1() {
		super.f1();
		System.out.println("child method");
	}
}
