package September;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagrams("nitin", "tiine"));
		
	}
	
	
	public static boolean anagrams(String s,String s1)
	{
		//String s="nitin";
		//String s1="tiinn";
		
		
		if(s.length()!=s1.length())
		{
			
			
			System.out.println("not anagram");
			return false;
		}
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.indexOf(s1.charAt(i))==-1)
			{
				
				return false;
				
			}
			
			
		}
		
return true;
	}

}
