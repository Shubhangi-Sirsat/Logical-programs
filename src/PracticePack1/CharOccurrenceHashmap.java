package PracticePack1;

import java.util.HashMap;

public class CharOccurrenceHashmap {

	public static void main(String[] args) {
		
		String str="life is beautiful";
		//char split[]=str.split("");
		char split[]=str.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<split.length;i++)
		{
			
			if(map.containsKey(split[i]))
				{
				int count=map.get(split[i]);
				map.put(split[i], count+1);
				}
			else
			{
				map.put(split[i], 1);
			}
			
		}
		System.out.println(map);

	}

}
