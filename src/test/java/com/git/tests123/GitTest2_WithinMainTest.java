package com.git.tests123;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GitTest2_WithinMainTest {

	
	@Test
	public void GitTest2_WithinMain_method1() {
		System.out.println(" GitTest2_WithinMain_method1 Only for git jenkins test ..");
SoftAssert sa = new SoftAssert();
sa.assertEquals(false, false);
sa.assertAll();
	}
	
}
