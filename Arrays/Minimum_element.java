
class Minimum_element
{
	public static void main(String[] args) {
		int []arr={1,2,3,4};
		int min=arr[0];

		for(int i =0;i<arr.length;i++)
		{
			if (arr[i]<min) 
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum_element is"+min);
	}
}

//Minimum_element is 1