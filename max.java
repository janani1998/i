class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n[]={2,-2,-2,-2,-2,-2,-2,-2,-2,-2};
		int max=n[0];
		for(int i=0;i<10;i++)
		{
			if(n[i]>max)
			max=n[i];
		}
		System.out.print(max);
	}
}
