
public class VariableDemo {


	public static void main(String[] args) {
	
		int a,b,c,f;           //-2^31 to 2^31
		long l;                // -2^63 to 2^63
		byte n= -127; 
		                      //-127  to 128         -130    -127   -126 -3  -2 -1 0 1 2 3 4  127 128
		short   sh= 32762;   //-32762 to 32762
		  
		double d1=30.567;  //8 byte
		
		float f1=40.0f;    //4 byte        
		String s="Java";
		String s2="Java345*&^^^";
		//long/int/float/short,char,boolean;
		char s4='c';
		a=20;
		b=30;
		c=a+b;
		System.out.println(c);
		f=a-b;
		
		boolean d=2<5;
		//Data types =Primitive ,Nonprimitive
		boolean t=true;
	  
		System.out.println(f1);
		
		
		
		
		
	}

}
