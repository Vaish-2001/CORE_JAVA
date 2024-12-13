// find the maximum element of a element
class Maximun_element
{
	public static void main(String[] args) {
		int arr[]={8,2,3,5,54,12};
		int max= arr[0];

		for (int i=0;i<arr.length;i++ ) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("the maximum element is: "+max);
	}
}

// the maximum element is: 54