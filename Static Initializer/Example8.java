class Example8
{
	static String vr="hi from global";
	public static void main(String[] args) 
	{
		String vr ="hi from local";
		System.out.println(vr);
		System.out.println(Example8.vr);
		m1();
	}

	public static void m1()
	{
		System.out.println(vr);
	}
}

// hi from local
// hi from global
// hi from global
