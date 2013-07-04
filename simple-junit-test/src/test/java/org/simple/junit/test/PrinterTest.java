package org.simple.junit.test;

import org.junit.Test;

import com.tomasz.goralski.methods.Printer;

public class PrinterTest {

	@Test
	public void testPrintHello() {
		Printer printer = new Printer();
		org.junit.Assert.assertSame("Bad message", "Hello",
				printer.printHello());
	}
}
