// //program 2

// class MethodExample2
// {
//   public static void main(String[]args)
//     {
//       String name="ramesh";
//       int index= 3;
//       char Ch=demo(name,index);
    
//       System.out.println(name+"has a charractor "+Ch+" at  index");
//     }
 
//   public static char demo(String abc,int index)
//     {
//        // int index=4;
//      char Ch=abc.charAt(index);
//      return Ch;
//    } 
//  }//rameshhas a charractor e at  index

//  //index are start from zero so ch='e 'is on the 3rd index.
//  //charAt() : returns the charctor at the specified index(position) in a String .


// other option ----->
class MethodExample2
{
  public static void main(String[]args)
    {
      String name="ramesh";
      int index= 3;
      char Ch=demo(name,index);
    
      System.out.println(name+"has a charractor "+Ch+" at  index");
    }
 
  public static char demo(String name,int index)
    {
     // int index=4;
     char Cha=name.charAt(index);
     return Cha;
   } 
 }