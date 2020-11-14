import java.util.Scanner;

public class Array_19 
{
	public static void main(String[] args)
	{
		Array_19 sp=new Array_19();
		System.out.println("Enter Any Length of Array ?  ?");
		int arr1[]=sp.readArray();
		int z=sp.bigNum(arr1);
		sp.displayArray(z);
	}

	private void displayArray(int z) {
		System.out.println("Big Number is : "+ z);
	}

	private int bigNum(int[] arr1) 
	{
		int big=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>big)
				big=arr1[i];
		}
		return big;
	}

	private int[] readArray() 
	{
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr1[]=new int[length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		return arr1;
	}
}
/*
Enter Any Length of Array ?  ?
5
12
14
51
24
15
Big Number is : 51
*/
