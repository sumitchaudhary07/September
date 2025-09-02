package September;

public class reverseOnlyVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hbsajdhashkvjqweaciknsou";
		//bu,
		
		char c[]=s.toCharArray();
		
		int start=0;
		int end=c.length-1;
		String vowel="aeiouAEIOU";
		
		while(start<end)
		{
			if(vowel.indexOf(c[start])==-1)
			{
				
				start++;
				
			}
			else if(vowel.indexOf(c[end])==-1)
			{
				
				
				end--;
			}
			
			else
			{
				char temp=c[start];
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
				
			}
			
			
			
			
		}
		System.out.println(c);
		
	}

}
