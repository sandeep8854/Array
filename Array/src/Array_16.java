import java.util.Scanner;

public class Array_16
{
	public static void main(String[] args) 
	{
		Array_16 ao=new Array_16();
		System.out.println("Enter First Array ? ?");
		int arr1[]=ao.readArray();
		System.out.println("Enter Second Array ? ?");
		int arr2[]=ao.readArray();
		int z[]=ao.merge(arr1,arr2);
		System.out.println("After Merge..");
		ao.displayArray(z);
	}

	private void displayArray(int[] z) 
	{
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
	}

	private int[] merge(int[] a, int[] b) 
	{
		int arr3[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			arr3[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			arr3[a.length+i]=b[i];
		}
		return arr3;
	}

	private int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		int length1=sc.nextInt();
		int arr_1[]=new int[length1];
		for(int i=0;i<arr_1.length;i++)
		{
			arr_1[i]=sc.nextInt();
		}
		return arr_1;
	}
}
/*
Enter First Array ? ?
5
10
20
30
40
60
Enter Second Array ? ?
2
14
25
After Merge..
10
20
30
40
60
14
25
*/