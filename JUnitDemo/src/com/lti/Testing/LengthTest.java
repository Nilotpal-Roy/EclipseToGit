package com.lti.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LengthTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	void test1() {
		Test1 t1=new Test1();
		assertEquals(5,t1.getLength("abcde"));
	}
	@Test
	void test2() {
		Test1 t1=new Test1();
		assertEquals(7,t1.getLength("a b c d"));
	}
	

}
