
public class PalindromeTest {

	public static void main(String[] args) {
		String str="madam";
		StringBuilder sb=new StringBuilder(str);
		StringBuilder reverse=sb.reverse();
		String str2=reverse.toString();
		if(str.equals(str2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}
}
