package Abstraction;

public class Astudent extends Aperson{

int rno,marks,c,cpp,java;
	
	public void setdata(int rn,int m1,int m2,int m3 )//overload
	{
		rno=rn;
		c=m1;
		cpp=m2;
		java=m3;
		
	}
	
	public void showdata()
	{
		
		System.out.println("name="+name);
		System.out.println("city="+city);
		System.out.println("gender="+gender);
		System.out.println("mobno="+mobno);
		System.out.println("age="+age);
		System.out.println("display information");
		System.out.println("rno="+rno);
		System.out.println("m1="+c);
		System.out.println("m2="+cpp);
		System.out.println("m3="+java);
	}
}
