package PracticePack1;

public class MaxNumber {

	public static void main(String[] args) {
		int arr[]= {23,12,45,1,90};
		int len=arr.length;
		int max1=0;
		int max2=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
		}
		System.out.println("max1="+max1+"max2="+max2);

	}

}
