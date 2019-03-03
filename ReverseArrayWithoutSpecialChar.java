package arrayPractice;

public class ReverseArrayWithoutSpecialChar {
	
	
	//i:p  = arr[]={a,b,$,c}  o:p = {c,$,b,a}
	
	public static char[] reverse12(char[] cs)
	{
		int l =0;
		int r = cs.length-1;
		char[] reverse = new char[r+1];
	
		while (l<r)
		{
			if(Character.isAlphabetic(cs[l]))
			{
				reverse[r]=cs[l];
				l++;
			}
			else if(Character.isAlphabetic(cs[l]))
			{
				reverse[l]=(char) cs[r];
				r--;
			}
			else
			{
				reverse[l]= cs[l];
				reverse[r]= cs[r];
				
				l++;
				r--;
			}
		}
		return reverse;
		
		
	}
	
	public static String reverseStrSpecial(String str) {
	    int len = str.length();
	    char[] revStrArr = new char[len];
	    int j = len-1;
	    for (int i=0; i <= j; ) {
	        if(!Character.isAlphabetic(str.charAt(i))) {
	            revStrArr[i] = str.charAt(i);
	            i++;
	        } else if (!Character.isAlphabetic(str.charAt(j))) {
	            revStrArr[j] = str.charAt(j);
	            j--;
	        } else {
	            revStrArr[j] = str.charAt(i);
	            revStrArr[i] = str.charAt(j);
	            j--;
	            i++;
	        }
	    }

	    return new String(revStrArr);
	}
	
	public static void reverse(char str[]) 
    { 
        // Initialize left and right pointers 
        int r = str.length - 1, l = 0; 
  
        // Traverse string from both ends until 
        // 'l' and 'r' 
        while (l < r) 
        { 
            // Ignore special characters 
            if (!Character.isAlphabetic(str[l])) 
                l++; 
            else if(!Character.isAlphabetic(str[r])) 
                r--; 
  
            // Both str[l] and str[r] are not spacial 
            else 
            { 
                char tmp = str[l]; 
                str[l] = str[r]; 
                str[r] = tmp; 
                l++; 
                r--; 
            } 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String str = "a!!!b.c.d,e'f,ghi"; 
        char[] charArray = str.toCharArray(); 
  
        System.out.println("Input string: " + str); 
        reverse(charArray); 
       // String revStr = new String(charArray); 
  
        //System.out.println("Output string: " + revStr); 
        
        char[] op=reverse12(str.toCharArray());
        String rev = new String(op);
        //System.out.println(rev);
        
        
        
       String output= reverseStrSpecial(str);
       System.out.println(output);
        
        
    } 

}
