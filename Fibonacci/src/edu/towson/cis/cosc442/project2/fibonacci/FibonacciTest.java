package edu.towson.cis.cosc442.project2.fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link Fibonacci}.
 * 
 * @author Josh Dehlinger
 *
 */		
public class FibonacciTest {

	/** The fibonacci test object. */
	private Fibonacci fibonacci;
		
	@Before 
	/**
	 * The setUp method that creates the necessary test objects.
	 */
	public void setUp(){
		fibonacci = new Fibonacci();
	}
	
	
	@Test 
	/**
	 * Tests the correctness of the output of the fibonacci method against an input of 0
	 */
	public void testFibonacciCaseZero() {	
		assertEquals("0 expected when input is 0", 0, fibonacci.fibonacci(0));
	}
	
	@Test 
	/**
	 * Tests the correctness of the output of the fibonacci method against an input of 1
	 */
	public void testFibonacciCaseOne() {	
		assertEquals("1 expected when input is 1", 1, fibonacci.fibonacci(1));
	}
	
	@Test 
	/**
	 * Tests the correctness of the output of the fibonacci method against an input of a number that is neither 0 nor 1
	 */
	public void testFibonacciCaseDefault() {	
		assertEquals("13 expected when input is 7", 13, fibonacci.fibonacci(7));
	}
}

