
public class Array_4
{
	public static void main(String[] args)
	{
		int[] number= {2,-9,0,5,-25,22,9,8,12};
		int sum=0;
		
		//access all element using for each loop
		//add each element in sum
		for(int num:number) {
			sum=sum+num;
		}
		//get the total number of elements
		int arrayLength=number.length;
		
		//calculate the average
		//convert the average from int to double
		
		double average=((double)sum/(double)arrayLength);
		System.out.println("Sum = " +sum);
		System.out.println("Average  = " +average);
	
	}

}
