class Example3
{
  public static void main(String[]args)
   {
    System.out.println("main starts");
    ramesh();
    suresh();
    System.out.println("main ends");
   }

  public static void ramesh()
   {
    System.out.println("hello from ramesh");
   }
 
 public static void suresh()
   {
    System.out.println("suresh starts");
    ramesh();
    System.out.println("suresh ends");
   }

 public static void mahesh()
   {
    System.out.println("mahesh starts");
    System.out.println("mahesh ends");
   }
 }

//main starts
//hello from ramesh
//suresh starts
//hello from ramesh
//suresh ends
//main ends

