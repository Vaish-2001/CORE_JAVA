class CountEvenOdd
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++ ) 
    {
		    evenOdd(i);
		}
	}
        public static void evenOdd(int num)
        {            
               if(num%2==0)
               {
                 System.out.println("even :"+num);
               }
               else
               {
               System.out.println("odd :"+num);
   	       }
       }
}

// odd :1
// even :2
// odd :3
// even :4
// odd :5
// even :6
// odd :7
// even :8
// odd :9
// even :10