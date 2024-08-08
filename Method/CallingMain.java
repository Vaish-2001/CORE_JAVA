class CallingMain
{
  public static void main(String[]args)
    {
      System.out.println("hello from main");
      m1();
      System.out.println("bye to main");
    }

  public static void m1()
    {
      System.out.println("hello from m1()");
      String[]args ={"ramesh","suresh"};
      main(args);;
      System.out.println("bye from m1()");
    }
 }