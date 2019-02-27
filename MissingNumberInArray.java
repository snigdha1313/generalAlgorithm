package arrayPractice;

public class MissingNumberInArray {
	
	//approach 1 (Total sum - each number) will give the missing number if numbers are from 1 to n
	
	//But in this method if 1 to n are present ,it will give the missing number as the next possible number in the array
	//Complexity O(n)
	public static int findMissingNumber(int arr[])
	{
		int n = arr.length;
		int sum = (n+1)*(n+2)/2;
		for (int i =0 ; i<n ;i++)
			sum -=arr[i];
			
		return sum;
	}
	
	
	//approach 2 ( XOR of all the elements in the array(X1) and XOR of the elements from 1 to n (X2)
	//XOR of X1 and X2 should give the missing number
	//This m\ethod does not work iof array is not sort.
	//Complexity O(n)
	
	static int getMissingNo (int a[], int n) 
    { 
        int x1 = a[0];  
        int x2 = 1;  
          
        /* For xor of all the elements  
           in array */
        for (int i = 1; i < n; i++) 
            x1 = x1 ^ a[i]; 
                  
        /* For xor of all the elements  
           from 1 to n+1 */         
        for (int i = 2; i <= n+1; i++) 
            x2 = x2 ^ i;          
          
        return (x1 ^ x2); 
    } 
	
	
	public static void main(String args[])
	{
		//int arr[] = { 10,7,8,9,2,3,4,5,1};
		int arr1[]= {1,2,3,4,5,7,8};
		//int x = findMissingNumber(arr);
		//System.out.println(x);

		System.out.println(getMissingNo(arr1, 5));
	}
	

}
