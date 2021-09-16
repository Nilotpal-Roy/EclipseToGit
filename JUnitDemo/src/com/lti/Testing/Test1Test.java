package com.lti.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1Test {

	@Test
	void makeUpper1() 
	{
		Test1 t1=new Test1();
		String res=t1.makeUpper("Stars");
		assertEquals("STARS",res);
				
	}
	@Test
	void makeUpper2() 
	{
		Test1 t1=new Test1();
		String res=t1.makeUpper("Ant");
		assertEquals("ANT",res);
				
	}
	@Test
	void makeUpper3() 
	{
		Test1 t1=new Test1();
		String res=t1.makeUpper("KAIT");
		assertEquals("KAIT",res);
				
	}
	

}
