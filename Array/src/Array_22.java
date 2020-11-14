import java.util.Scanner;

public class Array_22
{
	/*intersection of two sets like as 
	   a={2,4,5,6,9};
	   b={2,3,5,6,7,9,10}
	   a intersection b={2,5,6,9}*/
		public static void main(String[] args)
		{
			Array_22 sp=new Array_22();
			System.out.println("Enter First Length Of Array ? ?");
			int arr1[]=sp.readArray();
			System.out.println("Enter Second Length Of Array ? ?");
			int arr2[]=sp.readArray();
			int z[]=sp.findCommonElement(arr1,arr2);
			System.out.println("After Find Intersection OR Common Element ..");
			sp.displayArray(z);	
		}

		private void displayArray(int[] z)
		{
			for(int i=0;i<z.length;i++)
			{
				System.out.println(z[i]);
			}
		}

		private int[] findCommonElement(int[] a, int[] b)
		{
			int c[]=new int[a.length];
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						c[k++]=a[i];
						break;		
					}
				}
			}
				int n[]=new int[k];
				for(int a_o=0;a_o<k;a_o++)
				{
					n[a_o]=c[a_o];
				}
			return n;
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
	Enter First Length Of Array ? ?
	6
	23
	45
	56
	78
	18
	32
	Enter Second Length Of Array ? ?
	3
	45
	56
	72
	After Find Common Element ..
	45
	56
	*/
