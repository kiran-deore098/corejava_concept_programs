
public class Strbuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("java");
		
		System.out.println("old string = "+sb);
		System.out.println(sb.append(" programming"));
		System.out.println("appending string="+sb);
		
		sb.insert(2, "PHP");
		System.out.println("inser string="+sb);
		
		sb.replace(2, 5, "python");
		System.out.println("replace string="+sb);
		
		sb.delete(2, 8);
		System.out.println("delete string="+sb);
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
