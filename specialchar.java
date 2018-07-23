class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="hello/.she is @good! girl,";
		s=s.replaceAll("[^,!@#$%^&*()./]","");
		System.out.print(s.length());
	}
}
