import java.util.Scanner;

public class Array_20 
{
	public static void main(String[] args)
	{
		Array_20 sp=new Array_20();
		System.out.println("Enter Any First Length of Array ?  ?  ?");
		int arr1[]=sp.readArray();
		System.out.println("Enter Any Second Length Of Array ?  ?  ?");
		int arr2[]=sp.readArray();
		int arr3[]=sp.mergeSortedArray(arr1,arr2);
		System.out.println("After Sorted Array . .");
		sp.displayArraySorted(arr3);
	}

	private void displayArraySorted(int[] sortedArr)
	{
		for(int i=0;i<sortedArr.length;i++)
		{
			System.out.println(sortedArr[i]);
		}
	}

	private int[] mergeSortedArray(int[] a, int[] b)
	{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
			c[k++]=a[i++];
		
		while(j<b.length)
			c[k++]=b[j++];
		
		return c;
	}

	private int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr_1[]=new int[length];
		for(int i=0;i<arr_1.length;i++)
		{
			arr_1[i]=sc.nextInt();
		}
		return arr_1;
	}

	
}
/*
Enter Any First Length of Array ?  ?  ?
4
12
15
17
19
Enter Any Second Length Of Array ?  ?  ?
4
13
14
16
18
After Sorted Array . .
12
13
14
15
16
17
18
19
*/
