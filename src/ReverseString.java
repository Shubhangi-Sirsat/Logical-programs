
public class ReverseString {

	public static void main(String[] args) {
		String s="life is beautiful";
		String[] parts=s.split(" ");
		for(int i=parts.length-1;i>=0;i--)
			System.out.println(parts[i]);

	}

}
