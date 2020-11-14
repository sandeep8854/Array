import java.util.Scanner;

public class Array_12 
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
		int count=0;
		for(int i=0;  i<arr.length; i++)
		{
			boolean rs=isPrimeNumber(arr[i]);
			if(rs==true)
				count++;
		}
		System.out.println("Number of Prime Number : " +count );
	}

	private static boolean isPrimeNumber(int num)
	{
		int i=2;
		while(num/2>=i)
		{
			if(num%i==0)
				return false;
			i++;
		}
		return true;
	}
}
/* Enter Any Length ? ?
5
4
6
1
1
1
Number of Prime Number : 3
*/
/*
Enter Any Length ? ?
5
12
7
9
5
11
Number of Prime Number : 3
*/
