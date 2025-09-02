package September;

import java.util.ArrayList;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]=  {"apple", "app", "april", "ape", "bat", "ball"};
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(String input:s)
		{
			StringBuilder sb=new StringBuilder();
			char c[]=input.toCharArray();
			for(int i=0;i<c.length;i++)
				
			{
				
				sb.append(c[i]);
				String prefix=sb.toString();
				al.add(prefix);
			}
			
		}
System.out.println(al);
	}

}
