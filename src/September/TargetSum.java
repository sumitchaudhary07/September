package September;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={6, 8, 11, 6, 7, 18};
		int target=17;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				int sum=a[i]+a[j];
				
				if(sum==target)
				{
					System.out.println("indexes are"+ i+ " "+j);
					
				}
				
			}
		}
		
	Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int k=0;k<a.length;k++)
		{
		int b=target-a[k];//17-11=6
		if(hm.containsKey(b))
		{
			
		System.out.println(hm.get(b)+" "+k);
		}
		
			hm.put(a[k], k);//6:0,8:1,
			
		
		}

	}

}
