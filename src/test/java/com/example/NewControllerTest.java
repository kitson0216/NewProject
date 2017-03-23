package com.example;

import org.junit.Assert;
import org.junit.Test;

public class NewControllerTest {

	@Test
	public void test_hello(){
		
		NewController nc = new NewController();
		String result = nc.hello();
		Assert.assertEquals("Hello world.", result);
	}
}
