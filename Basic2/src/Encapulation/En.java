package Encapulation;

public class En {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setRno(10);
		int rno=obj.getRno();
		
		obj.setName("kiran");
		obj.setCity("pune");
		obj.setMarks(100);
		
		System.out.println("rno="+obj.getRno());
		System.out.println("name="+obj.getName());
		System.out.println("city="+obj.getCity());
		System.out.println("mark="+obj.getMarks());

	}

}
