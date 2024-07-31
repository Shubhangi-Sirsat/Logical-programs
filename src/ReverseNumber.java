
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=3456723;
		int rem=0;
		int rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			System.out.println("rem="+rem);
			rev=rev*10+rem;
			System.out.println("rev="+rev);
			num=num/10;
			System.out.println("rem num="+num);
			
		}
		System.out.println(rev);
	}


}
