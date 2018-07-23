class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=3,t3=0,t1=1,t2=1;
		for(int i=1;i<=n;i++)
		{
			 System.out.print(t1+" ");
			 t3=t1+t2;
			 t1=t2;
			 t2=t3;
		}
	}
}
