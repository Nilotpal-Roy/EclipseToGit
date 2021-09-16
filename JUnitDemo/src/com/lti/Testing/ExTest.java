package com.lti.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@Test
	void test1()
	{
		try 
		{
			Ex e=new Ex();
			
			int[] r=e.remDups(new int[] {-1});
		}
		catch(Exception e) 
		{
			assertEquals(e.getMessage(),"Invalid");
		}
	}
	@Test
	void test2()
	{
		try
		{
			Ex e=new Ex();
			int[] l= {1,2,2,3,4,5};
			int[] k= {1,2,3,4,5};
			int[] m=e.remDups(l);
			
			assertArrayEquals(k,m);
			
		}
		catch(Exception e) 
		{
			
		}
	}
	@Test
	void test3()
	{
		try 
		{
			Ex e=new Ex();
			int[] l= {1,2,2,3,4,5,5,6};
			int[] k= {1,2,3,4,5,6};
			int[] m=e.remDups(l);
			
			assertArrayEquals(k,m);
			
		}
		catch(Exception e)
		{
			
		}
	}
}
