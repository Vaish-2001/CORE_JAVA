class Factorial
{
	static int num=5;
	static int fact =1;
	public static void main(String[] args) 
	{
		factorial();
		System.out.println(fact);
	}
	public static void factorial()
	{
		fact=fact*num;
		num--;
		if(num>0)

		    factorial();
	}
}
//120
