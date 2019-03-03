package Dummy;

public class BinarySearch {

	public static int binarysearch(int arr[], int l, int r, int x) {
		if (r >=l) {
			int mid = l + (r - l) / 2;
			System.out.println("mid is "+mid);
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarysearch(arr, l, mid - 1, x); 
			
			return binarysearch(arr, mid + 1, r, x);
			
		}

		return -1;

	}
	
	

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int len = arr.length;
		int m =binarysearch(arr, 0, len - 1, 5);
		System.out.println(m);

	}

}
