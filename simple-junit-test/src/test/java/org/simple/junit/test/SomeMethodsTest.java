package org.simple.junit.test;

import org.junit.Assert;
import org.junit.Test;

import com.tomasz.goralski.methods.SomeMethods;

public class SomeMethodsTest {

	@Test
	public void testReturnTrue() {

		SomeMethods sm = new SomeMethods();
		Assert.assertTrue("Nie zwrocił true", sm.returnTrue());

	}

}
