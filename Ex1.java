public class Ex1
{
	public static void main(String[] args)
	{
		int[] A=new int[50];
		for(int i=0; i<25; i++)
			A[i]=i*i;
			
		for(int i=25; i<50; i++)
			A[i]=3*i;
		
		for(int i=0; i<50; i++)
		{
			System.out.print(A[i]+"\t");
			if((i+1)%10==0)
				System.out.println();
		}
	}
}