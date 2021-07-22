package com.git.tests123;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GitCheck {

	
	@Test
	public void gitTest_Method1() {
		System.out.println("gitTest_Method1 Only for git jenkins test ..");

	}
	@Test
	public void gitTest_Method2() {
		System.out.println("gitTest_Method2 Only for git jenkins test ..");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(true, true);
		sa.assertAll();

	}
}
