import java.util.Scanner;

public class Array_9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length   ? ? ");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int big=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
	       	}
		}
		System.out.println("Highest Number is : " +big);
	}
}
/*
Enter Any Length   ? ? 
5
12
14
15
18
09
Highest Number is :18
*/
