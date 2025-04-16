package JUnit4.JUnit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
 
public class TestCase01 {
	testLib1 obj = new testLib1();
	
	@Before
	public void setUp() {
		System.out.println("before");
	}
 
	@Test
	public void test1() {
		obj.test1();
	}
	@Test
	public void test2() {
		obj.test2();
	}
	@Test
	public void test3() {
		obj.test3();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("after");
	}
 
}
