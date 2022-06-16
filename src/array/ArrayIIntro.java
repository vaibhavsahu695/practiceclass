package array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayIIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int

		int []a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[1]);
		System.out.println(a.length);
		System.out.println(a.hashCode());
		a[3]=60;                                   //changed data
		System.out.println(Arrays.toString(a));
		//OR
		
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//String
		String []s= {"vaibhav","umesh","bhagyashri","uddesh","sahu"};
		System.out.println(s[2]);
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		
		for(int i=0; i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
		
		//Double
		
		char[]c= {'@','#','&','*'};
		
		System.out.println(Arrays.toString(c));
		
		//ReverseArray
		
		int[]b= {20,69,87,59,78};
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(b));
		
		System.out.println("Reverse Array");
		
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
		
		//Ascending Array
		
		for(int i=0; i<=b.length-1;i++)
		{
			for(int j=i+1; j<=b.length-1;j++)
			{
				if(b[j]<b[i])
				{
					int h=b[i];
					b[i]=b[j];
					b[j]=h;
				}
				}
			}
		System.out.println(Arrays.toString(b));
		//OR
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		

		//Descending Array
		for(int i=0; i<=b.length-1;i++)
		{
			for(int j=i+1; j<=b.length-1;j++)
			{
				if(b[j]>b[i])
				{
					int h=b[j];
					b[j]=b[i];
					b[i]=h;
				}
				}
			}
		System.out.println(Arrays.toString(b));
		//OR
		  // Arrays.sort(b, Collections.reverseOrder());
		
		//System.out.println(Arrays.toString(b));
		
	
		//string Sorting
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		//
		
		
		
		
		
		
		
		
	}

}
