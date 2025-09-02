package September;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sumit";
		System.out.println(isPalindrome(s));
		reverse(s);

	}
	
	public static boolean isPalindrome(String s) {
		
		
		char c[]=s.toCharArray();
		
		int start=0;
		int end=c.length-1;
		
		while(start<end)
		{
			if(c[start]!=c[end])
			{
				System.out.println("not palundrome");
				
				return false;
			}
			
			
			start++;
			end--;
			
		}
		return true;
				
	}
	
public static void reverse(String s) {
		
		
		char c[]=s.toCharArray();
		
		int start=0;
		int end=c.length-1;
		
		while(start<end)
		{
			if(c[start]!=c[end])
			{
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
			}
			
			
			start++;
			end--;
			
		}
		System.out.println(c);;
		
				
	}

}
