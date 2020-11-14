import java.util.Scanner;

public class Array_28 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length Of Array ?  ? ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean br=printFrequency(arr);
	}
	private static boolean printFrequency(int[] a) 
	{
		boolean b[]=new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i] + " Occurred " + count + " Time");
			}		
		}
		return false;
	}
}
/*
Enter Any Length Of Array ?  ? 
10
11
12
13
14
15
11
15
14
16
13
11 Occurred 2 Time
12 Occurred 1 Time
13 Occurred 2 Time
14 Occurred 2 Time
15 Occurred 2 Time
16 Occurred 1 Time
*/
