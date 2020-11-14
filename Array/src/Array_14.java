import java.util.Scanner;

public class Array_14 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length  ?  ? ");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int evenCount=0,oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean br=evenOrOddCount(arr[i]);
		     if(br==true)
		    	 evenCount++;
		     else
		     oddCount++;
		}
		System.out.println("Even Number : " +evenCount);
		System.out.println("Odd  Number : " +oddCount);
	}

	private static boolean evenOrOddCount(int num)
	{
		if(num%2==0)
			return true;
		else
		return false;
	}
}
/*
Enter Any Length  ?  ? 
10
14
14
16
215
26
15
15
15
18
215
Even Number : 5
Odd  Number : 5
*/

