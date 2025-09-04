package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 2, 3, 4, 5}; 
		int[] array2 = {4, 4,5, 6, 7, 8};
		
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<array1.length;i++)
		{
			
			
			list1.add(array1[i]);
		}
		

		for(int i=0;i<array2.length;i++)
		{
			
			
			list2.add(array2[i]);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
