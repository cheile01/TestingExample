/**
 * 
 */
package myPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author cheile01
 *
 */
public class AdderTest {
	private int expected;
	private static int firstInput;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		firstInput = 7;
	}

	@Before
	public void setUp() throws Exception {
		expected =1;
	}
	
	
	@Test(timeout=10)
	public void test() {
		int input1 = 465134;
		int input2 = 321552;
		int expectedOutput = 786686;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test2() {
		int input1 = 7;
		int input2 = 4;
		int expectedOutput = 11;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}

	@Test
	public void testWithSetUp() {
		int input1 = 0;
		int input2 = 1;
		int expectedOutput = expected;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wronge answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void testWithSetUpBeforeClass() {
		int input1 = firstInput;
		int input2 = 5;
		int expectedOutput = 12;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}


}
