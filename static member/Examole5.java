// we cannot access non static method directly 

class Examole5
{
	public static void main(String[] args) 
	{
		m1();
		Example5_a.m2();
	}

	public void m1()
	{
		System.out.println("hello from  non static m1");
	}
}

class Example5_a
{
	public void m2()
	{
		System.out.println("hello from non static m2()");
	}
}
 //CTE
 // non-static method m1() cannot be referenced from a static context
 //                m1();
 //                ^