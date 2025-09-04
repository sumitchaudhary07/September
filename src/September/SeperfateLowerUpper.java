package September;

public class SeperfateLowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "aBACbcEDed" ;
		
		char c[]=Str.toCharArray();
		
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		for(int i=0;i<c.length;i++)
		{
			
			if(Character.isLowerCase(c[i]))
			{
				sb1.append(c[i]);
				
				
			}
			
			else if(Character.isUpperCase(c[i]))
			{
				sb2.append(c[i]);
				
			}
		}
		
		System.out.println(sb1);
		System.out.println(sb2);
	}

}
