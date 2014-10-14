/**
 * 
 */
package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cheile01
 *
 */
public class SubtractorTest {

	@Test
	public void test() {
		int input1 = 9;
		int input2 = 6;
		int expectedOutput = 3;

		Subtractor addObj = new Subtractor();

		int actualOutput = addObj.subtract(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test2() {
		int input1 = 5;
		int input2 = 3;
		int expectedOutput = 2;

		Subtractor addObj = new Subtractor();

		int actualOutput = addObj.subtract(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test3() {
		int input1 = 7;
		int input2 = 3;
		int expectedOutput = 4;

		Subtractor addObj = new Subtractor();

		int actualOutput = addObj.subtract(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test4() {
		int input1 = 6;
		int input2 = 1;
		int expectedOutput = 5;

		Subtractor addObj = new Subtractor();

		int actualOutput = addObj.subtract(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}

}
