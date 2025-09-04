package September;

public class SecongMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {23,43,21,12,56,43,21,78,43,44};
  int largest=Integer.MIN_VALUE;
  int secondlargest=Integer.MIN_VALUE;
  int smallest=Integer.MAX_VALUE;
  int secondsmallest=Integer.MAX_VALUE;
  for(int i=0;i<a.length;i++)
  {
	  if(a[i]>largest)
	  {
		  secondlargest=largest;
		  largest=a[i];
		  
		  
	  }
	  else if (a[i]>secondlargest&&a[i]!=largest)
	  {
		  
		  secondlargest=a[i];
		  secondsmallest=a[i];
		  
	  }
	  
	  
  }
  
  System.out.println(secondlargest);
  System.out.println(largest);
  for(int i=0;i<a.length;i++)
  {
	  if(a[i]<smallest)
	  {
		  
		  secondsmallest=smallest;
		  smallest=a[i];
		  
	  }
	  else if (a[i]<secondsmallest&&a[i]!=smallest)
	  {
		  
		  secondlargest=a[i];
		  secondsmallest=a[i];
		  
	  }
	  
	  
  }
  
  

  
  
  System.out.println(secondsmallest);
  System.out.println(smallest);
	}

}
