package com.example.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.unitTesting.Service.HelloService;

class HelloServiceTest {

	@Test
	void testAdd() {
		HelloService hs=new HelloService();
		int result=hs.add(34,9);
		assertEquals(43, result);
		
	}

}
