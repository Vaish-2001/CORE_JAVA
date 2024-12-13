import java.util.Arrays;
class Merge_arrays
{
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int arr2[]={5,6,7};

		int newarr[]= new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++){
			newarr[i]=arr1[i];
		}
		for(int i =0;i<arr2.length;i++){
			newarr[arr1.length +i]= arr2[i];
		}

		System.out.println("merging arrays is :" +Arrays.toString(newarr));
	}
}

//merging arrays is :[1, 2, 3, 5, 6, 7]