class PrintNum
{
	static int number=1;
	public static void main(String[] args)
	{
		printnum();
	}
	public static void printnum()
	{
		System.out.println(number);
		number++;
		if(number>10)
		{
			return;
		}
		printnum();
	}
}

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
