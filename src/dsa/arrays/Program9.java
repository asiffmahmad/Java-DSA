package dsa.arrays;


/*
 * 
 * 9. Palindrome Number
 */
public class Program9 {
	
	public static void main(String[] args) {
		
		boolean isPalindrome = isPalindrome(121);
		
		System.out.println(isPalindrome);
	}
	
	
	
	public static  boolean isPalindrome(int x) {

        if (x < 0 ) return false ;

        String sf = String.valueOf(x);
        StringBuffer s = new StringBuffer(sf);
        String reverserString =s.reverse().toString();
        

        if(reverserString.equals(sf)){
            return true;
        }
        else
         return false;
        
    }

}
