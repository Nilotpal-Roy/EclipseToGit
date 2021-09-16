package com.lti.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveDupsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		RemoveDups d=new RemoveDups();
		int[] a= {10,20,30};
		int[] b;
		int[] m= {10,20,20,30,30};
		b=d.remDups(m);
		assertArrayEquals(a,b);
	}
	@Test
	void test2() {
		RemoveDups d=new RemoveDups();
		int[] a= {9,1,2,3};
		int[] b;
		int[] m= {9,9,1,2,3};
		b=d.remDups(m);
		assertArrayEquals(a,b);
	}
	@Test
	void test3() {
		RemoveDups d=new RemoveDups();
		int[] a= {1,2,3,4};
		int[] b;
		int[] m= {1,2,3,4};
		b=d.remDups(m);
		assertArrayEquals(a,b);
	}

}
