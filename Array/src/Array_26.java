import java.util.Scanner;

public class Array_26 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length Of Array  ?  ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index who's want to  delete ? ? ");
		int index=sc.nextInt();
		
		arr=deleteSpacificPosition(arr,index);
		System.out.println("After Deleting The Element ..");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	private static int[] deleteSpacificPosition(int[] arr, int index)
	{
		if(index < 0 || index > arr.length)
		{
			System.out.println("Index Not in Range ");
			return arr;
		}
		else
		{
			int newArr[]=new int[arr.length-1];
			for(int i=0;i<arr.length-1;i++)
			{
				if(i < index)
					newArr[i]=arr[i];
				else
					newArr[i]=arr[i+1];
			}
			return newArr;
		}
	}
}
/*
Enter Any Length Of Array  ?  ?
3
10
20
30
Enter the index who's want to  delete ? ? 
4
Index Not in Range 
After Deleting The Element ..
10
20
30
*/
/*
Enter Any Length Of Array  ?  ?
5
1
2
3
4
5
Enter the index who's want to  delete ? ? 
5
After Deleting The Element ..
1
2
3
4
*/
