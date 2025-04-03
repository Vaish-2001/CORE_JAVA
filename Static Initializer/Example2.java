class Example2
{
	static int i =10; //global variable
	public static void main(String[] args) 
	{
		int i =20;//local variable 
	System.out.println(Example2.i);//call global variable
	System.out.println(i);// call local variable
	Example2.i=30;//initilize the global var
	System.out.println(Example2.i);// call globle var
    }
}

// 10
// 20
// 30