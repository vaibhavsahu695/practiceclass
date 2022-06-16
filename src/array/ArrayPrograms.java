package array;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arraysum();
		arraysearch();
		reversestring();

	}

	public static void arraysum()
	{
		int sum=0;
		int a[]= {10,20,50,60};
		for(int i=0; i<a.length;i++)
		{
			sum=a[i]+sum;
					
		}
		System.out.println("sum of array "+sum);
		System.out.println("avg of array "+sum/a.length);
		
	}
	public static void arraysearch()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int count=0;
		int b[]= {10,10,20,90,80,80,30};
		
		for(int i=0; i<b.length;i++)
		{
			if(b[i]==n)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(n+" is repeated "+count+" times");
		}
		else {
			System.out.println("item not found");
		}
		
	}
	public static void reversestring()
	{
		String s="sidhu moosewala";
		String[] ss=s.split(" ");
		
		for(String sss:ss)
		{
			String rev="";
			for(int i=sss.length()-1;i>=0;i--)
			{
				rev=rev+sss.charAt(i);
			}
			System.out.print(rev+" ");
		}
		
		
	}
	
}
