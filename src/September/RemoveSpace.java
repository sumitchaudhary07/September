package September;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="This is Java";

//s=s.replace(" ", "");

//System.out.println(s);

StringBuilder sb=new StringBuilder();

for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ')
	{
	sb.append(s.charAt(i));

	}
}

System.out.println(sb);



	}

}
