package September;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="after";
		String t="before";
		System.out.println(s+" "+t);
		String u=s+t; //ThisJava
		s=u.substring(s.length(),u.length());
		t=u.substring(0,u.length()-s.length());
		System.out.println("after swap");
		System.out.println(s+" "+t);
	
	}

}
