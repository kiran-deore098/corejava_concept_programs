
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int i,sum=0;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		for(i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println("sum="+sum);
	}

}
