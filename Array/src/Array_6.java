import java.util.Scanner;

public class Array_6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size  ? ");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		System.out.println("Enter the "+length+" element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]----->"+arr[i]);
		}
	}
}
/*
Enter The Size  ? 
5
Enter the 5 element
12
14
11
04
16
arr[0]----->12
arr[1]----->14
arr[2]----->11
arr[3]----->4
arr[4]----->16
*/
