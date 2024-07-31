
public class Charoccurrence2 {

	public static void main(String[] args) {
		String str="shubhangi sirsat";
		char[] c=str.toCharArray();
		int count = 0;
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			if(c[i]=='s')
			{
				count=count+1;
				//System.out.print(count);
			}
		}
		
		System.out.println(count);

	}

}
