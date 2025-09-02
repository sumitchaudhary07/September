package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LIstNoDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);		
		list.add(1);	
		list.add(3);	
		list.add(3);	
		list.add(4);	
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i:list)
		{
			set.add(i);
			
			
		}
		System.out.println(set);
		
		
		List<String> list1=Arrays.asList("Apple","Orange","Apple","Kiwi","Mango","Mango");
		
		Set<String> set1=new LinkedHashSet<String>(list1);
		System.out.println(set1);

		List<String> list2=new ArrayList<String>();
		list2.add("Apple");		
		list2.add("Orange");	
		list2.add("Apple");	
		list2.add("Kiwi");	
		list2.add("Mango");
		list2.add("Mango");
		List<String> list3=new ArrayList<String>();
		list3.add("Apple");		
			
		list3.add("Mango");
		list3.add("Lichi");
		
		list2.addAll(list3);
		System.out.println(list2);
	
		Set<String> set2=new LinkedHashSet<String>(list2);
		
		System.out.println(set2);
		
		
	}

}
