import java.util.Scanner;

public class Array_25
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length Of Array ? ? ");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of spacified position ");
		int index=sc.nextInt();
		
		System.out.println("Enter the element to replace the spacified the index ");
		int element=sc.nextInt();
		
		arr=insertElement(arr,index,element);
		System.out.println("After the insert the element ");
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}

	private static int[] insertElement(int[] a, int index, int element) 
	{
		if(index > a.length || index < 0 )
		{
			System.out.println("Invalid Index  .  .");
			return a;
		}
		else
		{
			int newArr[]=new int[a.length+1];
			for(int i=0;i<index;i++)
			{
				newArr[i]=a[i];
			}
			newArr[index]=element;
			for(int i=index;i<a.length;i++)
			{
				newArr[i+1]=a[i];
			}
			return newArr;
		}	
	}
}
/*
Enter Any Length Of Array ? ? 
5
11
12
13
14
15
Enter the index of spacified position 
5
Enter the element to replace the spacified the index 
16
After the insert the element 
11
12
13
14
15
16
*/
