
public class TypeOfVariable {
	int a;    //Gloable variable
	static int c;
	
	public void addition()
	{
		c=60;
		int b=40;   //local
		System.out.println(c);
	}
	
	public void print()
	{
		System.out.println();
	}
	
public static void main(String[] args) {
		
	TypeOfVariable t=new TypeOfVariable();
	t.addition();
	
	System.out.println(c);
	}

	
	
	

	
}
