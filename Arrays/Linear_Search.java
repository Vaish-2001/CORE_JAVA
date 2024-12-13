class Linear_Search
{
	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,6};
		int target=2;
		boolean found =false;

		for (int i =0;i<arr.length;i++) 
		{
			if(arr[i]== target)
			{
				System.out.println("target is"+ target+ i);
				found=true;
				break;
			}
		}
		if (! found)
		{
			System.out.println("target"+target);
		}
	}
}
//target is 2 1