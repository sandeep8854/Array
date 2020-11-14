import java.util.Scanner;

public class Array_21 
{
	public static void main(String[] args) 
	{
		Array_21 sp=new Array_21();
		System.out.println("Enter Length of First Array ?  ?");
		int arr1[]=sp.readArray();
		System.out.println("Enter Length of Second Array ?  ?");
		int arr2[]=sp.readArray();
		int z[]=sp.zigZagArray(arr1,arr2);
		System.out.println("After Zig Zag ..");
		sp.displayZigzag(z);	
	}

	private void displayZigzag(int[] z)
	{
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
	}

	private int[] zigZagArray(int[] a, int[] b) 
	{
		int c[]=new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length && i<b.length)
		{
			c[k++]=a[i];
			c[k++]=b[i++];
		}
		while(i<a.length)
			c[k++]=a[i++];
		while(i<b.length)
			c[k++]=b[i++];
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
nter Length of First Array ?  ?
5
1
3
5
7
9
Enter Length of Second Array ?  ?
5
2
4
6
8
10
After Zig Zag ..
1
2
3
4
5
6
7
8
9
10
*/
