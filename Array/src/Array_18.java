import java.util.Scanner;

public class Array_18
{
	public static void main(String[] args) 
	{
		Array_18 sp=new Array_18();
		System.out.println("Enter The Length Of Array? ? ?");
		int arr1[]=sp.readArray();
		int sum_1=sp.sumOfArray(arr1);
		sp.displayArray(sum_1);
	}
	private void displayArray(int x)
	{
		System.out.println("Sum Of Array : "+x);	
	}
	private int sumOfArray(int[] arr1) 
	{
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		return sum;
	}

   private int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr2[]=new int[length];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		return arr2;
	}
}
/*
Enter The Length Of Array? ? ?
5
10
10
20
40
20
Sum Of Array : 100
*/
