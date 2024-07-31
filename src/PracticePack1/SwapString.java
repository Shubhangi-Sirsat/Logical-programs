package PracticePack1;

public class SwapString {

	static String string1;

	static String string2;

	public static void main(String[] args) {
		String s1="s1";
		String s2="s2";
		
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1+"  s2="+s2);
	}

}
