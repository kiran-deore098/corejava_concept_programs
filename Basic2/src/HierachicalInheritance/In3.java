package HierachicalInheritance;

public class In3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Three obj=new Three();
		obj.num1=10;
		obj.num3=20;
		System.out.println("num1 class one"+obj.num1);
		System.out.println("num3 class three"+obj.num3);
		
		Two obj1=new Two();
		obj1.num1=30;
		obj1.num2=50;
		System.out.println("num1 class one"+obj1.num1);
		System.out.println("num2 class two"+obj1.num2);

	
	}

}
