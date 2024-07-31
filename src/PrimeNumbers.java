//Which can be divided only by one or itself
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num=43;
		boolean flag=true;
		
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				
				
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("Given number is prime number");
		}
		else
			System.out.println("Given number is not prime number");
		
		
		
	}

}
