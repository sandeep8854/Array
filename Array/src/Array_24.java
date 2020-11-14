import java.util.Scanner;

public class Array_24
{
	static int size;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Length Of Array ? ?");
		int length=sc.nextInt();
		int arr1[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Length Of Array ?  ?");
		int length1=sc.nextInt();
		int arr2[]=new int[length1];
		for(int j=0;j<length1;j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		int arr3[]=unionArray(arr1,arr2);
		System.out.println("After Union of Two Sets..");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr3[i]);
		}
	}
	private static int[] unionArray(int[] a, int[] b)
	{
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			boolean bool=check(a[i],c);
			if( bool == false){
			    c[k] = a[i];
			    size++;
			    k++;
			  }
		}
		for(int j=0;j<b.length;j++)
		{
			boolean bool=check(b[j],c);
			if(bool==false)
			{
				c[k]=b[j];
				size++;
				k++;
			}
		}
		
		return c;
	}
	private static boolean check(int x, int[] c) //x is like as a[i]=2,4,6,8
	{
		if(size==0)
		{
			return false;
		}
		else
		{
			for(int i=size-1;i>=0;i--) {
				if(c[i]==x) {
					return true;
				}	
			}
		}
	
		return false;
	}
}
/*
Enter First Length Of Array ? ?
5
10
20
30
40
50
Enter Second Length Of Array ?  ?
4
20
40
60
40
After Union of Two Sets..
10
20
30
40
50
60
*/
