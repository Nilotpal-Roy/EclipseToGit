package com.lti.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		Test2 t2=new Test2();
		int res=0;
		try
		{
			res=t2.divide(10, 0);
		}
		catch(Exception e)
		{
			fail("Exception Occured");
		}
		assertEquals(res,-1);
	}

}
