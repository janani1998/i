class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="laptop is good";
            	String str[]=s.split(" ");
		int l=str.length;
		int c=0;
		for(int i=0;i<l;i++)
		{
			c=c+str[i].length();
		}
		System.out.print(c);
	}
}
