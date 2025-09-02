package September;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="This is sumit chaudhary";
		
		//StringBuilder sb=new StringBuilder(s);
		//System.out.println(sb.reverse());
		
		
		String splitarray[]=s.split(" ");
		
		/*for(String input:splitarray)
		{
			
			
			StringBuilder sb1=new StringBuilder(input);
			
			System.out.print(sb1.reverse()+" ");
		}*/
		String reverse="";
		
		for(int i=0;i<splitarray.length;i++)
		{
			String currentWord=splitarray[i];
			String nstr="";
			for(int j=currentWord.length()-1;j>=0;j--)
			{
				//System.out.println(currentWord.charAt(j));
				 nstr=nstr+currentWord.charAt(j);
				
			}
			//System.out.print(" ");
			System.out.print(nstr+" ");
		}
	//	System.out.println(reverse);
		
	}

}
