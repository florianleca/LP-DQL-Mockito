package org.exemple.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	
	Calculator calc;
	
	Calculator service = Mockito.mock(Calculator.class);
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@After
	public void tearDown() {
		calc = null;
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
		when(service.add(4, 8)).thenReturn(5);
		assertEquals(5, service.add(4,8));
		verify(service).add(4, 8);
		//verify(service, times(1)).add(4, 8);
	}

}
