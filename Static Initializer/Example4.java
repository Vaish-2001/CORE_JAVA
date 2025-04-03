class Example4
{
	static int op =add(10,20);
	public static void main(String[] args) 
	{
		System.out.println("hello ");
		System.out.println(op);
	}

	public static int add(int num1,int num2)
	{
		System.out.println("hello");
		return num1+num2;
	}
}

// hello
// hello
// 30