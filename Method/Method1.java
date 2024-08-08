//program 1

class Method1
 {
  public static void main(String[]args)
    {
    System.out.println("program starts");
    MyMethod();
    Checkevenodd();
    System.out.println("program ends");
    }

  public static void MyMethod()
    {
    System.out.println("hello from my method");
    }

 public static void Checkevenodd()
   {
    int num=34;
    if(num%2==0)
     {
       System.out.println("it is even nnum");
     }
     else 
     {
       System.out.println("it is odd number");
     }
   }
}

// program starts
// hello from my method
// it is even nnum
// program ends
