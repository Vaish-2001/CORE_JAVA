class EvenNum
{   
	static int num=1;
	public static void main(String[] args) 
	{
		evennum();
	}
	public static void evennum()
	{
		if(num>10)
		{
			return;
		}
		if(num%2==0)
		{
			System.out.println(num+"even");
			num++;
			evennum();
		}
	}
}