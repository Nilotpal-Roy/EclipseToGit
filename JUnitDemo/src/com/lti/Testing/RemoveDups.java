package com.lti.Testing;
import java.util.*;

public class RemoveDups 
{
	int[] remDups(int[] input) 
	{
		
		List<Integer> l2=new ArrayList<Integer>();
		
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
		
		return a;
		
		
	}
	

}
