package Abstraction;

public abstract  class Aperson {
	
		String name,city,gender,mobno;
		int age;
		
		public void setdata(String nm,String ct,String gend,String mn,int ag)
		{
			name=nm;
			city=ct;
			gender=gend;
			mobno=mn;
			age=ag;
		}

		public abstract void showdata(); //declaration of abstarct class
		
	
}
