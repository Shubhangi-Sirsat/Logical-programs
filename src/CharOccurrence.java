import java.util.HashMap;
import java.util.Map;

class CharOccurrence
 
{
 
public static void main(String a[])
{

String str="aaabcdds";
char c[]=str.toCharArray();
//String[] split=str.split(" ");
Map<Character,Integer> hp= new HashMap();


for(char ch:c)
{
	hp.put(ch, hp.getOrDefault(ch, 0)+1);
	
}

for (Character key : hp.keySet()) {
    System.out.println(key + ": " +hp.get(key));
}

	
}
}