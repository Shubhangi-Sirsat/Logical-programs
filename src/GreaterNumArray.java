
public class GreaterNumArray {

	public static void main(String[] args) {
		
		int[] a= {4,6,3,9,67,45};
		int g1=0,g2=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>g1)
			{
				g2=g1;
				g1=a[i];
			}
		}
		System.out.println("g1="+g1);
		System.out.println("g2="+g2);
		
	}

}
