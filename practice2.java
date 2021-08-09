import java.util.*;
public class practice2
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("how many array values do you want");
		int g=s.nextInt();
		int arr[]=new int[g];
		int i,j; 
		System.out.println("Enter array values");
		for(i=0;i<g;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<g;i++)
		{
			for(j=i+1;j<g;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The Duplicate element is=" +arr[i]);
				}
			}
		}
	}
}
