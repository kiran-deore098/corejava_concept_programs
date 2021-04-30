
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="my name is bond";
		String str2="bond";
		String str3="my name "+"is bond";
		
		String str4=new String("my name is bond");
		
		System.out.println("result="+(str1==str3));
		System.out.println("content1="+str1.equals(str3));
		
		System.out.println("result1="+(str1==str2));
		System.out.println("content2="+str1.equals(str2));
		
		System.out.println("result3="+(str1==str4));
		System.out.println("content3="+str1.equals(str4));
	}

}
