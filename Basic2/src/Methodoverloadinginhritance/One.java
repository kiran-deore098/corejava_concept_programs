package Methodoverloadinginhritance;

//both inheritance
public class One {
	int num1;
	public One()
	{
		System.out.println("one class is executed");
	}

	public void f()
	{
		System.out.println("f1 method parent");
		
	}
	
	public void f(int x)
	{
		System.out.println("f1 method of parent class with one parameter");
	}
}
