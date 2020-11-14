import java.util.Scanner;
public class Array_27
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Length Element of Array ?  ?");
		int length=sc.nextInt();
		int arr1[]=new int[length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Second Length Element Of Array ?  ?");
		int length1=sc.nextInt();
		int arr2[]=new int[length1];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter Index from want to add Array ? ?");
		int index=sc.nextInt();
		
	    int arr3[]=insertSpacific(arr1,arr2,index);
	    System.out.println("After Adding The Element ");
	    for(int i=0;i<arr3.length;i++)
	    {
	    	System.out.println(arr3[i]);
	    }
	}

	private static int[] insertSpacific(int[] a, int[] b, int index) 
	{
		if(index < 0 || index > a.length)
		{
			System.out.println("Index Not in Range ");
			return a;
		}
		else
		{
			int c[]=new int[a.length+b.length];
			for(int i=0;i<b.length;i++)
			{
				c[index+i]=b[i];
			}
			for(int i=0;i<a.length;i++)
			{
				if(i<index)
					c[i]=a[i];
				else
					c[i+b.length]=a[i];
			}
			return c;
		}	
	}
}
/*
Enter First Length Element of Array ?  ?
5
11
12
13
14
15
Enter Second Length Element Of Array ?  ?
4
19
20
21
22
Enter Index from want to add Array ? ?
4
After Adding The Element 
11
12
13
14
19
20
21
22
15
*/
/*
 
 */

