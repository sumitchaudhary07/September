package September;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5, -1, 90, 1, 6, 3}; 
		int largest=array[0];
		int smallest=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]>largest)
			{
				
				largest=array[i];
				
			}
			
			else if(array[i]<smallest)
			{
				
				smallest=array[i];
				
			}
			
			
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}

}
