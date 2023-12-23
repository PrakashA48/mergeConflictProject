package com.tech;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class junitClass {

	@Test
	public void junitMethod() {
		System.out.println("Executing Junit Test Cases");
		String str1 = "Executing Junit Test Cases";
		assertEquals("Executing Junit Test Cases", str1);

	}

}
