import java.util.Scanner;

public class Array_11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?  ?");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int positive=0,negative=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				negative++;
			else
				positive++;
		}
		System.out.println("Number of positve number : "+positive);
		System.out.println("Number of negative number : "+negative);
	}

}
/*
Enter Any Length ?  ?
5
12
-14
15
-45
-14
Number of positve number : 2
Number of negative number : 3
*/