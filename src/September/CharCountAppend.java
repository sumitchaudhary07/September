package September;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CharCountAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbccddeejgfdjasg";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			//char prev = 0;
			char current=s.charAt(i);
			int count=1;
			
		
			for(int j=i+1;j<s.length();j++)
			{
				
			if(s.charAt(j)==current)
			{
				count++;
			
			}
			}
			
				
			if(count>1)
			{
			sb.append(current).append(count);
			}
			
		}
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{ if(hm.containsKey(s.charAt(i)))
		{
			
			hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			
		}
		else
		{
			hm.put(s.charAt(i), 1);
			
		}
		}
		System.out.println(hm);
		
		Set<Entry<Character,Integer>> set=hm.entrySet();
		Iterator<Entry<Character,Integer>> itr=set.iterator();
		while(itr.hasNext())
		{
			char key=itr.next().getKey();
			int value=hm.get(key);
			
			sb1.append(key).append(value);
			
			
		}
		
		
		System.out.println(sb1);
		
		
		
		}
		
		

	}


