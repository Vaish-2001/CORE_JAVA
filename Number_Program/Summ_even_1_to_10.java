//sum of even number from 1 to N
class Summ_even_1_to_10
{
	public static void main(String[] args) {
		int n =10;
		int even=0;
		for (int i =2;i<=10;i+=2) 
		{
			even= even+i;
		}
		System.out.println(even);
	}
}