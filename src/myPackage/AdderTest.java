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
public class AdderTest {

	@Test
	public void test() {
		int input1 = 3;
		int input2 = 5;
		int expectedOutput = 8;

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


}
