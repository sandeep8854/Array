import java.util.Scanner;

public class Array_10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ? ?");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	//	int sum=arr[0];
		int sum=0;
		 //  for(int i=1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum Of The Number: " + sum);
	}

}
/*
Enter Any Length ? ?
5
4
5
14
15
26
Sum Of The Number: 64
*/