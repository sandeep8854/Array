import java.util.Scanner;

public class Array_15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array ? ?");
		int length1=sc.nextInt();
		
		int arr1[]=new int[length1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Second Length of Array ? ?  ");
		int length2=sc.nextInt();
		
		int arr2[]=new int[length2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Merging The Array ");
		int merge[]=new int[arr1.length+arr2.length];
		for(int i=0;i<length1;i++)
		{
			merge[i]=arr1[i];
		}
		for(int i=0;i<length2;i++)
		{
			merge[arr1.length+i]=arr2[i];
		}
		
		System.out.println("After Merging The Array ");
		for(int i=0;i<length1+length2;i++)
		{
			System.out.println(merge[i]);
		}
		
	}

}
/*
Enter Length of Array ? ?
5
10
10
20
30
40
Enter Second Length of Array ? ?  
5
89
45
56
45
41
Merging The Array 
After Merging The Array 
10
10
20
30
40
89
45
56
45
41
*/
