
public class CinverFirstLetter {

	public static void main(String[] args) {
		String s="life is beautiful enjoy it";
		String[] split=s.split(" ");
		for(int i=0;i<split.length;i++)
		{
			char[] ch=split[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				ch[0]=Character.toUpperCase(ch[0]);
						System.out.print(ch[j]);
			}
			System.out.print(" ");
		}

	}

}
