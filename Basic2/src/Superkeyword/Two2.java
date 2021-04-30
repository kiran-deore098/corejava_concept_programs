package Superkeyword;

public class Two2 extends One1{
	//num1
	int num1;
	public Two2()
	{
		System.out.println("child class");
		
	}
	
	public void f1() {
		//super.f1();
		int num1=100;
		this.num1=200;
		super.num1=300;
		System.out.println("child method");
		System.out.println("num="+num1);
		System.out.println("num1="+this.num1);
		System.out.println("num1="+super.num1);
	}
}
