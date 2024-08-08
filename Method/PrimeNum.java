
class PrimeNum
{
    public static void main(String[]args)
      {
        for(int i=2;i<=50;i++)
         {
          isPrime(i);
         }
      }

    public static void isPrime(int num)
      {
        boolean flag =true;
        for(int i=2;i<=60;i++)
          {
           if(num%i==0)
             {
              flag=false;
              break;
             }
          }

        if(flag==true)
        {
        System.out.println("prime: "+num);
        }
        else
        {
        System.out.println(" not prime: "+num);
        }
     }
 }



 //  not prime: 2
 // not prime: 3
 // not prime: 4
 // not prime: 5
 // not prime: 6
 // not prime: 7
 // not prime: 8
 // not prime: 9
 // not prime: 10
 // not prime: 11
 // not prime: 12
 // not prime: 13
 // not prime: 14
 // not prime: 15
 // not prime: 16
 // not prime: 17
 // not prime: 18
 // not prime: 19
 // not prime: 20
 // not prime: 21
 // not prime: 22
 // not prime: 23
 // not prime: 24
 // not prime: 25
 // not prime: 26
 // not prime: 27
 // not prime: 28
 // not prime: 29
 // not prime: 30
 // not prime: 31
 // not prime: 32
 // not prime: 33
 // not prime: 34
 // not prime: 35
 // not prime: 36
 // not prime: 37
 // not prime: 38
 // not prime: 39
 // not prime: 40
 // not prime: 41
 // not prime: 42
 // not prime: 43
 // not prime: 44
 // not prime: 45
 // not prime: 46
 // not prime: 47
 // not prime: 48
 // not prime: 49
 // not prime: 50