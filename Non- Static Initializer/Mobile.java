class Mobile_State
{
	String brad;
	String model;

	Mobile_State()
	{
		System.out.println("hello from constructor");
	}
	{
		System.out.println("hello from non static ");
	}
}
class Mobile
{
	public static void main(String[] args) 
	{
		Mobile_State obj1=new Mobile_State();
		Mobile_State obj2=new Mobile_State();
		Mobile_State obj3=new Mobile_State();
	}
}

// hello from non static
// hello from constructor
// hello from non static
// hello from constructor
// hello from non static
// hello from constructor