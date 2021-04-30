
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 obj=new Ex3();
		System.out.println("instance is="+obj.y);
		
		System.out.println("static is="+Ex3.x);
		
		obj.fun1();
		Ex3.fun2();
	}

}
