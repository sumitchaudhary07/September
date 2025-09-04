package September;

public class PrintTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
		
		char c[]=s.toCharArray();
		char c1[]=new char[2*c.length];
		int temp=0;
		for(int i=0;i<c.length;i++)
		{
			
		c1[2*i]=c[temp];
		c1[(2*i)+1]=c[temp];
			temp++;
		}
System.out.println(c1);
	}

}
