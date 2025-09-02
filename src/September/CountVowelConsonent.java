package September;

public class CountVowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Hello World";
		
	char c[]=s.toCharArray();
	int vowel=0;
	int consonent=0;
	
	for(int i=0;i<c.length;i++)
	{
		if(c[i]!=' ')
{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			vowel++;
			
		}
		else
		{
			
			consonent++;
		}
}
	}
	
	System.out.println(vowel);
	System.out.println(consonent);
	}

}
