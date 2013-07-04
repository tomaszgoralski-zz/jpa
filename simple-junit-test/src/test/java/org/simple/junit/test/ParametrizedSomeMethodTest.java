package org.simple.junit.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tomasz.goralski.methods.SomeMethods;

@RunWith(value = Parameterized.class)
public class ParametrizedSomeMethodTest {

	private boolean expected;
	private Date date;

	@Parameters
	public static Collection<?> getTestParameters() {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1983, 7, 30);
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1995, 6, 30);
		
		return Arrays.asList(new Object[][] {

		{ true, cal1.getTime() }, { true, cal2.getTime() },
				{ false, new Date() }, });
	}

	public ParametrizedSomeMethodTest(boolean expected, Date date) {
		this.expected = expected;
		this.date = date;
	}

	@Test
	public void testValidateDate() {

		SomeMethods sm = new SomeMethods();
		Assert.assertEquals(expected, sm.validateDate(date));

	}

}
