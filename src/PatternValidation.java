import java.util.regex.Pattern;

public class PatternValidation {

	public static void main(String[] args) {
		
		String str[]= {"abc", "123", "*&%"};
		Pattern pattern=Pattern.compile(".[^0-9].");
		for(int i=0;i<str.length;i++)
			System.out.println("Numbers are="+str[i]+!pattern.matcher(str[i]).matches());

	}

}
