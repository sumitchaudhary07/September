package September;

public class Sumonlyinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"}; 
	int sum=0;
	for(String s:array)
	{
		
		if(!s.matches("[0-9]"))
		{
			System.out.println(s);
			//sum=sum+Integer.parseInt(s);
			
			
		}
		
	}
	
	System.out.println(sum);
		
	}

}
