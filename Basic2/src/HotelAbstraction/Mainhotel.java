package HotelAbstraction;

public class Mainhotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer obj1=new Customer();
		obj1.showdata();
		obj1.calculatebill();
		
		Maneger obj2=new Maneger();
		obj2.setdata();
		obj2.showdata();
		obj2.salary();
	}

}
