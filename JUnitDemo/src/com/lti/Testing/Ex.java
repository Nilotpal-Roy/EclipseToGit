package com.lti.Testing;
import java.util.*;
class InvalidArrayException extends Exception
{
	public InvalidArrayException(String str)
	{
		super(str);
	}
}
public class Ex
{
	int[] remDups(int[] input) throws InvalidArrayException
	{
		
		List<Integer> l2=new ArrayList<Integer>();
		for(int k:input)
		{
			if(k<=0)
				throw new InvalidArrayException("Invalid");
		}
		for(int x=0;x<input.length;x++)
		{
			if((l2.contains(input[x])))
			{
				continue;
			}
			
			else
			{
				l2.add(input[x]);
			}
		}
		int[] a=new int[l2.size()];
		for(int i=0;i<l2.size();i++)
		{
			a[i]=l2.get(i);
		}
		//for(int i:a)
			//System.out.println(i);
		return a;
		
		
	}
	/*public static void main(String[] args) 
	{
		Ex e=new Ex();
		int[] c= {1,2,2,3,4};
		try {
			System.out.println(e.remDups(c));
		} catch (InvalidArrayException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			e1.getMessage();
		};
	}*/
}
