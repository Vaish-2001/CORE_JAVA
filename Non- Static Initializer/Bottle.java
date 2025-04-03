class Bottle_State
{
	String material;
	int cap;
	double weight;
	{
		System.out.println("non static block");
	}
    
    void dispplayBottle()
    {
    	System.out.println(" materil "+material+" cap "+cap+"w eight "+weight);
    }
}

class Bottle
{
	public static void main(String[] args) 
	{
		Bottle_State obj1=new Bottle_State();
		obj1.dispplayBottle();

        Bottle_State obj2=new Bottle_State();
		obj2.dispplayBottle();

		 Bottle_State obj3=new Bottle_State();
		obj3.dispplayBottle();
	}
}

// non static block
//  materil null cap 0w eight 0.0
// non static block
//  materil null cap 0w eight 0.0
// non static block
//  materil null cap 0w eight 0.0