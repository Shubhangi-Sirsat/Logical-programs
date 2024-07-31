
public class CharTypes {

	public static void main(String[] args) {
		String str="shubhangisirsat19@gmail.com";
		String num="";
		String letter="";
		String  symbol="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				num=num+c;
			}
			else if(Character.isLetter(c))
			{
				letter=letter+c;
			}
			else
			{
				symbol=symbol+c;
			}
		}
		System.out.println("Letters="+letter);
		System.out.println("Numbers="+num);
		System.out.println("Symbols="+symbol);
		
		
	}

}
