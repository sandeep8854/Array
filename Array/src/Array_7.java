import java.util.Scanner;

public class Array_7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Size ? ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		
		System.out.println("Enter The "+length+ " element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Reverse The Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]------->"+arr[i]);
		}
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("After Reverse of an Array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]-------->"+arr[i]);
		}
	}
}
/*
Enter Any Size ? ?
5
Enter The 5 element
10
20
30
40
50
Before Reverse The Array
arr[0]------->10
arr[1]------->20
arr[2]------->30
arr[3]------->40
arr[4]------->50
After Reverse of an Array 
arr[0]-------->50
arr[1]-------->40
arr[2]-------->30
arr[3]-------->20
arr[4]-------->10
*/